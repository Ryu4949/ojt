import axios from "axios";
import secret from "../../secrets.json";

const instance = axios.create({
    baseURL: "https://api.themoviedb.org/3",
    params: {
        api_key: secret["api_key"],
        language: "ko-KR",
    }
})

export default instance;