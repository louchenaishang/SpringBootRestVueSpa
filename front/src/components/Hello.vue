<template>
  <div class="hello">
    <h1>环境:{{ env }}</h1>
    <router-link to="/city">City Api</router-link>
  </div>
</template>

<script>
  export default {
    name: 'hello',
    data () {
      return {
        env: process.env.NODE_ENV
      }
    },
    computed: {},
    methods: {

    },
    mounted(){
      console.log('hello.vue mounted')
    },
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
