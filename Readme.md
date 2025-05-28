Para empezar, modifique la class coche añadiendole deposito, despues empleee esa variable en el model retornandola como int y en el controller para calcular la diferencia de lo que le queda con lo que tenia inicialmente y lo saque por pantalla en la view
Para el caso del avance lo que hice fue pedirle la velocidad de la matricula que quiere y retornanrla en el model, una vez la tenga la iguale en el controller a un int y le pedi al usuario que me diera el tiempo que estubo sin detenerse con lo que solo las multiplique y retorne.






















```mermaid
sequenceDiagram 
    participant Model
    participant Controller
    participant View


    
    activate View
    View->>View:Menu()
    
    View->>Controller:1.Crear coche
    activate Controller
    Controller->>Model: Model.crearCoche()
    activate Model
    Model->>Controller: coche
    deactivate Model
    Controller->>+View: Controller2.visualizarCoche(coche)
    deactivate Controller
    activate View
    View->>View:Mostrando coche
    deactivate View
    deactivate View
    View->>Controller:2.Mostrar velocidad
    activate Controller
    Controller->>+Model: Model.getVelocidad()
    Model->>Controller:velocidad
    deactivate Model
    Controller->>+View: Controller2.visualizarVelocidad(velocidad)
    deactivate Controller
    activate View
    View->>-View: Mostrando velocidad
    deactivate View
    View->>Controller:3.Cambiar Velocidad velocidad
  activate Controller
    Controller->>Model:Model.aumentarVel()
    activate Model
    Controller->>Model:Model.disminuirVel()
    Model->>Controller:Velocidad(aumentada,disminuida)
    deactivate Model
    Controller->>+View:Controller2.VelAumentada
    deactivate Controller
    View->>View:Mostrando Velocidad Cambiada
    deactivate View
    deactivate View
    View-->View:Salendo...
    
    

```
