import axios from '../api/axios'
import React, { useEffect, useState } from 'react'
import requests from '../api/request'

const Banner = () => {

  const [movie, setMovie] = useState([]);

  useEffect(() => {
    fetchData();
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
    <header
    className='banner'
    style={{
      backgroundImage: `url("https://image.tmdb.org/t/p/original/${movie.backdrop_path}")`,
      backgroundPosition: "top center",
      backgroundSize: "cover",
    }}>
      <div className='banner__contents'>
        <h1 className='banner__title'>
          {movie.title || movie.name || movie.original_name}
        </h1>

        <div className='banner__buttons'>
          {movie?.videos?.results[0]?.key &&
          <button
          className='banner__button play'
        >
          Play
          </button>
          }
        </div>
        <p className='banner__description'>
          {movie.overview}
        </p>
      </div>
      <div className='banner__fadeBottom'></div>

    </header>
  )
}

export default Banner
