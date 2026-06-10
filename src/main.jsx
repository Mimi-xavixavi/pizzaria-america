import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
// import './index.css

import AppRoutes from './routes/AppRoutes'

import App from './App'
 
// Importar o bootstrap
 
import 'bootstrap/dist/css/bootstrap.min.css'
 
createRoot(document.getElementById('root')).render(
  <StrictMode>
    <App/>
  </StrictMode>,
)
 

