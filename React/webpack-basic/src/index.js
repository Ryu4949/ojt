import getRandomAddress from "./randomAddress"
import { nanoid } from "nanoid";


// webpack 설치 없이 실행하면 오류 발생
// cannot use import statement outside a module
console.log(getRandomAddress());

console.log(nanoid());