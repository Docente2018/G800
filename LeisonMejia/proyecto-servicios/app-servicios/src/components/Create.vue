<template>
    <div>
        <v-container v-if="error.lenght > 0">
             <v-alert
                :value="true"
                type="error"
                dismissible
                >
                {{error}}
            </v-alert>
        </v-container>

        <v-container fluid fill-height>
            <v-layout align-center justify-center>
            <v-flex xs12 sm8 md6>
                <v-card class="elevation-12" v-if="post">
                <v-img
                    :src="imagePath"                    
                    aspect-ratio="2.75"
                    height="200px"
                    ></v-img>
                <v-card-text>
                    <v-form>
                        <v-text-field prepend-icon="text_format" name="title" label="Título" type="text" 
                        v-model="post.title"></v-text-field>

                        <swatches v-model="post.colorTitle" popover-to="rigth"
                        colors="text-advanced">                            
                            <v-text-field 
                            prepend-icon="format_color_fill"
                            name="title" label="Color del título" type="text" 
                            class="form__input__element" readonly
                            slot="trigger"
                            v-model="post.colorTitle"></v-text-field>
                        </swatches>

                        <v-textarea id="content" prepend-icon="note" name="content" label="Contenido" type="text"
                        v-model="post.content"></v-textarea>

                        <v-text-field id="photo" prepend-icon="image" name="photo" label="URL imagen" type="text" 
                        v-model="imagePath"></v-text-field>
                    </v-form>
                </v-card-text>
                <v-card-actions>
                    <v-btn fab dark small color="normal" @click="goHome()">
                        <v-icon dark>reply</v-icon>
                    </v-btn>

                    <v-spacer></v-spacer>
                    <v-btn color="info" @click="createPost()">Guardar</v-btn>
                </v-card-actions>
                </v-card>
            </v-flex>
            </v-layout>
        </v-container>
    </div>
</template>

<script>
import Swatches from 'vue-swatches'
import "vue-swatches/dist/vue-swatches.min.css"

import { PostService } from '../services/post.service.js'

export default {
    name: 'create',

    components: {
        Swatches
    },

    data: ()=> ({
        error: '',
        post: {},
        imagePath: ''
    }),

    watch:  {
    },

    created() {
        this.imagePath = 'https://cdn.pixabay.com/photo/2018/08/19/10/16/nature-3616194_960_720.jpg'
    },

    methods: {
        goHome() {
            this.$router.push('/');
        },

        createPost() {
            let postService = new PostService;
            this.post.imgUrl = this.imagePath;

            postService.createPost(this.post)
                .then(() => {
                    this.$router.push('/')
                })
                .catch(() => {
                    this.error = 'Ocurrio un error al crear el post. '
                })
        }
    }
}
</script>

