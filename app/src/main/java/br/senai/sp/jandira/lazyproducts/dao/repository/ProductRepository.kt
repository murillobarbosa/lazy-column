package br.senai.sp.jandira.lazyproducts.dao.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.lazyproducts.R
import br.senai.sp.jandira.lazyproducts.model.Product

class ProductRepository {
    companion object{
        var teste: String = "teste"

        @Composable
        fun getProductsList(): List<Product>{
            return listOf<Product>(



                Product(
                    id = 2, name = "Mouse"

                ),
                Product(
                    id = 3, name = "Teclado",
                    image = painterResource(id = R.drawable.oi)
                
                ),
                Product(id = 3, name = "Monitor", price = 897.99),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora"),
                Product(id = 4, name = "Impressora")


            )

        }
    }
}