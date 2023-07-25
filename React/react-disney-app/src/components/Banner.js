import axios from '../api/axios'
import React, { useEffect, useState } from 'react'
import requests from '../api/request'

const Banner = () => {

  const [movie, setMovie] = useState([]);

  useEffect(() => {

  }, [])

  const fetchData = async() => {
    const response = await axios.get(requests.fetchNowPlaying)
    console.log(response);

    const movieId = response.data.results[
      Math.floor(Math.random() * response.data.results.length)
    ].id

    // 특정 영화의 더 상세한 정보 가져오기
    const {data: movieDetail}  = await axios.get(`movie/${movieId}`,
    {params: {append_to_response: "videos"},});
    setMovie(movieDetail);
  }
  

  return (
    <div>
      Banner
    </div>
  )
}

export default Banner
