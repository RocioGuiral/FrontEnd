export class LoginUsuario {
    nombreUsuario: string;
    password: string;


    constructor(nombrUsuario: string, password: string){
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
}
