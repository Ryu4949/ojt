import getRandomAddress from "./randomAddress"
import { nanoid } from "nanoid";
import './styles/main.scss';
import mainImage from './assets/image.jpeg';


// webpack 설치 없이 실행하면 오류 발생
// cannot use import statement outside a module
console.log(getRandomAddress());

console.log(nanoid());

const img = document.getElementById('mainImage');
img.src = mainImage;