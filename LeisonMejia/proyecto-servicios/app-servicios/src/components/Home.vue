<template>
    <div>
        <v-container grid-list-md>
            <v-alert
            :value="true"
            type="error"
            v-if="error.lenght > 0"
            dismissible
            >
                {{error}}
            </v-alert>
            <v-layout row wrap>
                <v-flex xs12 md6 v-for="post in posts" :key="post.title">
                    <v-card class="my-3" hover>
                        <v-img
                        class="white--text"
                        height="170px"
                        :src="post.imgUrl"
                        >
                            <v-container fill-height fluid>
                                <v-layout>
                                    <v-flex xs12 align-end d-flex>
                                        <span class="headline" :style="{color: post.colorTitle}" >{{ post.title }}</span>
                                    </v-flex>
                                </v-layout>
                            </v-container>
                        </v-img>
                        <v-card-text>
                            {{ post.content }}
                        </v-card-text>
                        <v-card-actions>
                            <v-btn flat class="blue--text" @click="irEditar(post._id)">Editar</v-btn>
                        </v-card-actions>
                    </v-card>
                </v-flex>

                <v-btn fab dark color="orange"
                fixed
                bottom
                right
                @click="goCreate()">
                    <v-icon dark>add</v-icon>
                </v-btn>
            </v-layout>
    </v-container>
    </div>
</template>

<script>
import {PostService} from '../services/post.service.js';

export default {
    name: 'home',

    data: () => ({
      drawer: null,
      posts: [],
      error: ''
    }),

    created() {
        let postService = new PostService();
        postService.getPosts()
            .then(data => {
                this.posts = data.data
            })
            .catch(() => {
                this.error = 'Ocurrio un error consultando los posts.';
            })

    },

    methods: {
        irEditar(id) {
            this.$router.push({name: 'edit', params: { id: id }});
        },

        goCreate() {
            this.$router.push('create');
        }
    }
}
</script>

<style>
    .parallax {
        height: 50px;
    }
</style>
