import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('./components/Home.vue')
    },
    {
      path: '/edit/:id',
      name: 'edit',
      component: () => import('./components/Editar.vue')
    },
    {
      path: '/create',
      name: 'create',
      component: () => import('./components/Create.vue')
    }
  ]
})
