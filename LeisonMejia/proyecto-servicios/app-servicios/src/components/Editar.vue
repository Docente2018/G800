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
                    :src="post.imgUrl"
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
                        v-model="post.imgUrl"></v-text-field>
                    </v-form>
                </v-card-text>
                <v-card-actions>
                    <v-btn fab dark small color="normal" @click="goHome()">
                        <v-icon dark>reply</v-icon>
                    </v-btn>

                    <v-spacer></v-spacer>
                    <v-btn color="error" @click="deletePost(post._id)">Eliminar</v-btn>
                    <v-btn color="info" @click="savePost()">Guardar</v-btn>
                </v-card-actions>
                </v-card>
            </v-flex>
            </v-layout>
        </v-container>
    </div>
</template>

<script>
import { PostService } from '../services/post.service.js'
import Swatches from 'vue-swatches'
import "vue-swatches/dist/vue-swatches.min.css"

export default {
    name: 'Editar',

    components:{
        Swatches
    },

    data: () => ({
        post: null,
        error: ''
    }),

    created() {
        let postService = new PostService();
        postService.getPostById(this.$route.params.id)
            .then(response => {
                this.post = response.data
            })
            .catch(() => {
                this.error = 'No se pudo obtener el detalle.'
            })
    },

    methods: {
        goHome() {
            this.$router.push('/');
        },

        savePost() {
            let postService = new PostService();
            postService.updatePost(this.$route.params.id, this.post)
                .then(() => {
                    this.$router.push('/')
                })
                .catch(() => {
                    this.error = 'No se pudo realizar la actualización.'
                })
        },

        deletePost(id) {
            if (confirm('¿Esta seguro que desea eliminar esta card?')) {
                let postService = new PostService();
                postService.deletePost(id)
                .then(() => {
                    this.$router.push('/')
                })
                .catch(() => {
                    this.error = 'No se puedo llevar a cabo la eliminación.'
                })
            }
        }
    }
}
</script>

