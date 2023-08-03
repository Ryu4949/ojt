import React, { useCallback, useEffect, useState } from 'react'
import axios from '../api/axios'
import "./Row.css"
import MovieModal from './MovieModal'

import { Navigation, Pagination, Scrollbar, A11y } from 'swiper';
import { Swiper, SwiperSlide } from 'swiper/react';

import "swiper/css";
import "swiper/css/navigation";
import "swiper/css/scrollbar";
import "swiper/css/pagination";
import { styled } from 'styled-components';

const Row = ({title, id, fetchUrl}) => {
  const [movies, setMovies] = useState([])
  const [modalOpen, setModalOpen] = useState(false);
  const [movieSelected, setMovieSelection] = useState({});

  const fetchMovieData = useCallback(async() => {
    const response = await axios.get(fetchUrl);
    console.log(response);
    setMovies(response.data.results);
  }, [fetchUrl])

  useEffect(() => {
    fetchMovieData();
  }, [fetchMovieData])

  const handleClick = (movie) => {
    setModalOpen(true);
    setMovieSelection(movie)
  }

  return (
    <div>
      <h2>{title}</h2>
      <Swiper 
        modules={[Navigation, Pagination, Scrollbar, A11y]}
        loop={true} // loop기능 사ㅇㅕ부
        navigation  // arrow 버튼 사용 여부
        pagination={{ clickable: true}}
        >
          <Content id={id}>
      {movies.map(movie => (
        <SwiperSlide>
            <img
            key={movie.id}
            className="row__poster"
            src={`https://image.tmdb.org/t/p/original/${movie.backdrop_path}`}
            alt={movie.name}
            onClick={() => handleClick(movie)} />
            </SwiperSlide>
          ))}
          </Content>
          </Swiper>

      {modalOpen &&
      <MovieModal
      {...movieSelected} 
      setModalOpen={setModalOpen} 
      />
      }
    </div>
  )
}

export default Row

const Container = styled.div`
  padding: 0 0 26px;
`;

const Content = styled.div``;

const Wrap = styled.div``;