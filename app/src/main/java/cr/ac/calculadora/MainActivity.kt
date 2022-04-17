package cr.ac.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.mariuszgromada.math.mxparser.Expression
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var resultadoMostrar : String= ""
    var resultadoOculto : String= ""
    var text : TextView ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Botones
        text = findViewById(R.id.inputResultado)
        val button0 : Button = findViewById(R.id.button0)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val buttonClear : Button = findViewById(R.id.buttonClear)
        val buttonResiduo : Button = findViewById(R.id.buttonPorcentaje)
        val buttonDivision : Button = findViewById(R.id.buttonDivide)
        val buttonMultiplicacion : Button = findViewById(R.id.buttonMultiplicacion)
        val buttonMenos : Button = findViewById(R.id.buttonMenos)
        val buttonMas : Button = findViewById(R.id.buttonMas)
        val buttonComa : Button = findViewById(R.id.buttonComa)
        val buttonIgual : Button = findViewById(R.id.buttonIgual)
        //Listeners
        button0.setOnClickListener{
            button0Click()
        }
        button1.setOnClickListener{
            button1Click()
        }
        button2.setOnClickListener{
            button2Click()
        }
        button3.setOnClickListener{
            button3Click()
        }
        button4.setOnClickListener{
            button4Click()
        }
        button5.setOnClickListener{
            button5Click()
        }
        button6.setOnClickListener{
            button6Click()
        }
        button7.setOnClickListener{
            button7Click()
        }
        button8.setOnClickListener{
            button8Click()
        }
        button9.setOnClickListener{
            button9Click()
        }
        buttonClear.setOnClickListener{
            buttonClearClick()
        }
        buttonResiduo.setOnClickListener{
            buttonResiduoClick()
        }
        buttonDivision.setOnClickListener{
            buttonDivisionClick()
        }
        buttonMultiplicacion.setOnClickListener{
            buttonMultiplicacionClick()
        }
        buttonMenos.setOnClickListener{
            buttonMenosClick()
        }
        buttonMas.setOnClickListener{
            buttonMasClick()
        }
        buttonComa.setOnClickListener{
            buttonComaClick()
        }
        buttonIgual.setOnClickListener{
            buttonIgualClick()
        }





    }

    private fun button0Click() {
        resultadoMostrar = resultadoMostrar + "0"
        resultadoOculto= resultadoOculto + "0"
        text?.text = resultadoMostrar
    }
    private fun button1Click() {
        resultadoMostrar = resultadoMostrar + "1"
        resultadoOculto= resultadoOculto + "1"
        text?.text = resultadoMostrar
    }
    private fun button2Click() {
        resultadoMostrar = resultadoMostrar + "2"
        resultadoOculto= resultadoOculto + "2"
        text?.text = resultadoMostrar
    }
    private fun button3Click() {
        resultadoMostrar = resultadoMostrar + "3"
        resultadoOculto= resultadoOculto + "3"
        text?.text = resultadoMostrar
    }
    private fun button4Click() {
        resultadoMostrar = resultadoMostrar + "4"
        resultadoOculto= resultadoOculto + "4"
        text?.text = resultadoMostrar
    }
    private fun button5Click() {
        resultadoMostrar = resultadoMostrar + "5"
        resultadoOculto= resultadoOculto + "5"
        text?.text = resultadoMostrar
    }
    private fun button6Click() {
        resultadoMostrar = resultadoMostrar + "6"
        resultadoOculto= resultadoOculto + "6"
        text?.text = resultadoMostrar
    }
    private fun button7Click() {
        resultadoMostrar = resultadoMostrar + "7"
        resultadoOculto= resultadoOculto + "7"
        text?.text = resultadoMostrar
    }
    private fun button8Click() {
        resultadoMostrar = resultadoMostrar + "8"
        resultadoOculto= resultadoOculto + "8"
        text?.text = resultadoMostrar
    }
    private fun button9Click() {
        resultadoMostrar = resultadoMostrar + "9"
        resultadoOculto= resultadoOculto + "9"
        text?.text = resultadoMostrar
    }
    private fun buttonClearClick() {
        resultadoMostrar = ""
        resultadoOculto= ""
        text?.text = "0"
    }
    private fun buttonResiduoClick() {
        //%
        resultadoMostrar = resultadoMostrar + "%"
        resultadoOculto= resultadoOculto + "#"
        text?.text = resultadoMostrar
    }
    private fun buttonDivisionClick() {
        resultadoMostrar = resultadoMostrar + "/"
        resultadoOculto= resultadoOculto + "/"
        text?.text = resultadoMostrar
    }
    private fun buttonMultiplicacionClick() {
        resultadoMostrar = resultadoMostrar + "x"
        resultadoOculto= resultadoOculto + "*"
        text?.text = resultadoMostrar
    }
    private fun buttonMenosClick() {
        resultadoMostrar = resultadoMostrar + "-"
        resultadoOculto= resultadoOculto + "-"
        text?.text = resultadoMostrar
    }
    private fun buttonMasClick() {
        resultadoMostrar = resultadoMostrar + "+"
        resultadoOculto= resultadoOculto + "+"
        text?.text = resultadoMostrar
    }
    private fun buttonComaClick() {
        resultadoMostrar = resultadoMostrar + ","
        resultadoOculto= resultadoOculto + "."
        text?.text = resultadoMostrar
    }
    private fun buttonIgualClick() {
        var expression = Expression (resultadoOculto)
        text?.text = expression.calculate().toString()
        resultadoOculto=expression.calculate().toString()
        resultadoMostrar=expression.calculate().toString()
    }
}