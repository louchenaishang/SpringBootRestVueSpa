<template>
  <div class="city">
    <ul>
      <li v-for="item in cityList">ID:{{ item.id }},名称:{{ item.name }},创建时间:{{ item.createTime }},
        <button @click="deleteCity(item)">删除</button>
      </li>
    </ul>
    <div>
      <input type="text" value="" v-model="cityForm.name">
      <button @click="saveCity">保存</button>
    </div>

  </div>
</template>

<script>
  import Api from '@/api/api'

  export default {
    name: 'city',
    data () {
      return {
        apiPath: '/api/city',
        cityList: {
        },
        cityForm:{
            name: ''
        }
      }
    },
    computed: {},
    methods: {
      getCityList() {
        Api.getCityList({}).then(res => {
          this.cityList = res.data
        });
      },
      saveCity() {
        Api.saveCity(this.cityForm).then(res => {
          this.cityForm = {}
          this.getCityList()
        });
      },
      deleteCity(city) {
        Api.deleteCity(city).then(res => {
          this.getCityList()
        });
      }
    },
    mounted(){
      console.log('city.vue mounted')
      this.getCityList()
    },
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
