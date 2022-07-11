package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    // criando aqui para que eles possam ser acessados por qualquer metodo dentro da classe MainActivity.java
    // edit Text
    private EditText userName;
    private TextInputEditText userEmail;
    private TextView resultFields;
    // check Box
    private CheckBox checkBoxPreto, checkBoxVermelho, checkBoxAzul;
    private TextView resultColors;
    // radio Button
    private RadioButton sexoMasculino, sexoFeminino;
    private TextView resultSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referenciando o codigo com os IDs da interface
        // edit Text
        userName = findViewById(R.id.campoNome);
        userEmail = findViewById(R.id.campoEmail);
        resultFields = findViewById(R.id.txtResultadoCampos);
        // check Box
        checkBoxPreto = findViewById(R.id.checkPreto);
        checkBoxVermelho = findViewById(R.id.checkVermelho);
        checkBoxAzul = findViewById(R.id.checkAzul);
        resultColors = findViewById(R.id.txtResultadoCores);
        // radio Button
        sexoMasculino = findViewById(R.id.radioM);
        sexoFeminino = findViewById(R.id.radioF);
        resultSex = findViewById(R.id.txtResultadoSexo);

    }

    // metodo para enviar os dados dos campos (utilizando botao)
    public void cadastrar (View view) {

        String name = userName.getText().toString(); // captura o que foi digitado em userName, converte para String e salva na var name
        String email = userEmail.getText().toString(); // captura o que foi digitado em userEmail, converte para String e salva na var email
        resultFields.setText("Nome: " + name + " // E-mail: " + email);

    }

    // metodo para limpar os campos (utilizando botao)
    public void limpar(View view){

    userName.setText("");
    userEmail.setText("");
    resultFields.setText("");

    }

    // Exemplificando como chamar um metodo dentro de outro metodo
    public void checkBox(){

        String selectedColor = "";

        if (checkBoxPreto.isChecked()){
            selectedColor = checkBoxPreto.getText().toString();
        }

        if (checkBoxVermelho.isChecked()){
            selectedColor += checkBoxVermelho.getText().toString();
        }

        if (checkBoxAzul.isChecked()){
            selectedColor += checkBoxAzul.getText().toString();
        }

        resultColors.setText("Cores selecionadas: " + selectedColor);

    }

    public void filtrar(View view){

    checkBox();

    }

    public void radioButton(){

        String selectedSex = "";

        if (sexoMasculino.isChecked()) {
            selectedSex = "Masculino";
        } else {
            selectedSex = "Feminino";
        }

        resultSex.setText("Sexo selecionado: " + selectedSex);

    }


    public void enviar(View view){

        radioButton();

    }

}