import {
    BrowserRouter,
    Routes,
    Route
} from "react-router-dom"

// Obs: Para importar componentes específicos de uma tecnologia, escolha o componente, caso mais de 1
   // utilize a vírgula para separá-los
    import HomeFuncionario from '../pages/HomeFuncionario/HomeFuncionario'

const AppRoutes = () => {

    return (
         <BrowserRouter>
          <Routes>
             <Route
             path="/"
             element={<HomeFuncionario/>}
             />

             
          </Routes>
         
         </BrowserRouter>


    )
}

export default AppRoutes