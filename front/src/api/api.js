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

const getCityList = params => {
  return axios.get(`${base}/city`, params)
}

const saveCity = params => {
  return axios.post(`${base}/city`, params)
}

const deleteCity = params => {
  return axios.delete(`${base}/city/`+params.id)
}

const Api = {
  getCityList,
  saveCity,
  deleteCity
}

export default Api
