import React, { useEffect, useState } from 'react'
import { useLocation } from 'react-router-dom';
import { styled } from 'styled-components'

const Nav = () => {
  const [show, handleShow] = useState(false);
  const { pathname } = useLocation();

  useEffect(() => {
    window.addEventListener('scroll', handleScroll);
    return () => {
        window.removeEventListener("scroll", handleScroll)
    }
  }, [])

  const handleScroll = () => {
    if(window.scrollY > 50) {
        handleShow(true);
    } else {
        handleShow(false);
    }}

  return (
    <NavWrapper show={show}>
        <Logo>
            <img
            alt="Disney Plus Logo"
            src="/images/logo.svg"
            onClick={() => (window.Location.href="/")} />
        </Logo>

        {pathname === "/" ? (<Login>Login</Login>) : <Input className='nav__input' type="text" placeholder="검색해주세요."/>}
    </NavWrapper>
  )
}

export default Nav

const Login = styled.a`
`;

const Input = styled.input`
`;

const NavWrapper = styled.nav`
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  height: 70px;
  background-color: ${props => props.show ? "#090b13" : "transparent"};
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 36px;
  letter-spacing: 16px;
  z-index: 3;
  `;

const Logo = styled.a`
  padding: 0;
  width: 80px;
  margin-top: 4px;
  max-height: 70px;
  font-size: 0;
  display: inline-block;
  
  img {
    display: block;
    width: 100%;
  }`;
