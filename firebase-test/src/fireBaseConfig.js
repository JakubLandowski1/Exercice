// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyBKM16mwS4blSKrpjDIW9YeQWLwWsY-KqQ",
  authDomain: "cda-m2i-c29b8.firebaseapp.com",
  databaseURL: "https://cda-m2i-c29b8-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "cda-m2i-c29b8",
  storageBucket: "cda-m2i-c29b8.appspot.com",
  messagingSenderId: "146036209899",
  appId: "1:146036209899:web:cd56abd34c16a3628126ae",
  measurementId: "G-VCL5PRR2Q5"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);

export const BASE_DB_URL = firebaseConfig.databaseURL
export const SIGN_UP_URL = `https://identitytoolkit.googleapis.com/v1/accounts:signUp?key=${firebaseConfig.apiKey}`