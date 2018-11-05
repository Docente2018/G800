import axios from 'axios'

const API_URL = 'https://calm-harbor-69746.herokuapp.com/api/post'

export class PostService{
    constructor(){ }

    getPosts() {
        return axios.get(API_URL);
    }

    getPostById(id) {
        return axios.get(`${API_URL}/${id}`);
    }

    updatePost(id, body) {
        return axios.put(`${API_URL}/${id}`, body);
    }

    deletePost(id) {
        return axios.delete(`${API_URL}/${id}`);
    }

    createPost(post) {
        return axios.post(API_URL, post);
    }
}