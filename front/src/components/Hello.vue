<template>
  <div class="hello">
    <h1>env:{{ env }}</h1>
    <h2>api-path:{{ apiPath }}</h2>
    <h3>api-results:{{ city }}</h3>
  </div>
</template>

<script>
  import Api from '../api/api'

  export default {
    name: 'hello',
    data () {
      return {
        env: process.env.NODE_ENV,
        apiPath: '/api/city',
        city: {
        }
      }
    },
    computed: {},
    methods: {
      getCity() {
        Api.getCity({}).then(res => {
          console.log(res)
          console.log(res.data)
          this.city = res.data
        });
      }
    },
    mounted(){
      console.log('hello.vue mounted')
      this.getCity()
    },
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
