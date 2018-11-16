class AnimesController < ApplicationController
  require 'rubygems'
  # require 'httparty'

  include HTTParty
  base_uri "https://api-pplication-u.herokuapp.com"
  # base_uri "http://0.0.0.0:3009"
  PER_PAGINATE = 9

  def index

  end

  def destroy
    anime = Anime.find_by_id params[:id]
    if anime.destroy!
      redirect_to consult_all_animes_url
    end
  end

  def destroy_registers
    Anime.destroy_all
    redirect_to consult_all_animes_url
  end

  def consult_all
    @animes = Anime.all
  end

  def render_default_format(data, success, status = 200)
    render json: {
      success: success,
      data: data
    }, status: status
  rescue StandardError => e
    raise e
  end

  def get_data
    data = self.class.get('/animes/web_service_data.json')
    puts data.parsed_response
  end

  def web_service_data
    data = [
      {
        title: 'Naruto', in_emission: false, total_chapters: 945
      },
      {
        title: 'HUNTER x HUNTER', in_emission: false, total_chapters: 150
      },
      {
        title: 'Tokyo ghoul', in_emission: true, total_chapters: 70
      },
      {
        title: 'Full Metal alchemist', in_emission: false, total_chapters: 64
      },
      {
        title: 'Nanatsu no taizai', in_emission: false, total_chapters: 48
      },
      {
        title: 'digimon', in_emission: false, total_chapters: 215
      },
      {
        title: 'Goblin slayer', in_emission: true, total_chapters: 5
      },
      {
        title: 'Fairy Tail', in_emission: true, total_chapters: 450
      }
    ]
    render_default_format(data, true)
  end

  def web_service_update
    @create = 0
    @update = 0
    data = self.class.get('/animes/web_service_data.json')
    data.parsed_response['data'].each do |anime|
      anim = Anime.find_by_title anime['title']
      if anim.present?
        anim.update_attributes!(
          title: anime['title'],
          in_emission: anime['in_emission'],
          total_chapters: anime['total_chapters']
        )
        anim.update(anime)
        @update += 1
      else
        anim = Anime.new(anime)
        if anim.save!
          @create += 1
        end
      end
    end
  end

end
