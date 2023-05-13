package com.example.pizzeria.controlador;

import com.example.pizzeria.modelo.Pizza;
import com.example.pizzeria.modelo.RespuestaLogin;
import com.example.pizzeria.servicios.PizzaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController {
    private static final String USUARIO = "miusuariobonito";
    private static final String PASSWORD = "udev123";
    private PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/pizzas")
    public List<Pizza> getPizzas() {
        return pizzaService.obtenerTodasLasPizzas();
    }

    @GetMapping("loguin")
    private RespuestaLogin login(@RequestParam String usuario,
                                 @RequestParam String password) {
        RespuestaLogin respuestaLogin = new RespuestaLogin(false, "no pudo acceder");
        if (usuario.equals(USUARIO) && password.equals(PASSWORD)){
            respuestaLogin.setExito(true);
            respuestaLogin.setMensaje("accedio correctamente");
        }
        return respuestaLogin;
    }
}
