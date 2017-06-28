import axios from 'axios'

axios.defaults.withCredentials = true


axios.interceptors.request.use(function (config) {
  return config
}, function (error) {
  return Promise.reject(error)
})


axios.interceptors.response.use(function (response) {
  return response
}, function (error) {
  return Promise.reject(error)
})


let base = '/api'

const getCity = params => {
  return axios.get(`${base}/city`, params)
}

const Api = {
  getCity
}

export default Api
