package lab3p3_jesusrodriguez;
//La verdad siento que el codigo esta bueno, pero no se por que me tira el exception


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JColorChooser;

public class Lab3P3_JesusRodriguez {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {
        int res = 0;
        ArrayList<Carro_1> car = new ArrayList();
        ArrayList<Moto> motorcycle = new ArrayList();
        ArrayList<Bicicleta> bike = new ArrayList();
        ArrayList<Bus> bus = new ArrayList();
        ArrayList<CamionCarga> truck = new ArrayList();
        ArrayList<Cliente> clienteregistrado = new ArrayList();
        ArrayList<Concesionaria> empresa = new ArrayList();
        ArrayList<Vehiculo> vehicle = new ArrayList();
        do {
            System.out.println("----- Bienvenido al sistema de carros de la Alcaldia de Tegucigalpa -----"
                    + "\n1 -> Agregar Concesionaria "
                    + "\n2 -> Eliminar Concesionaria "
                    + "\n3 -> Modificar Concecionaria"
                    + "\n4 -> Agregar Cliente "
                    + "\n5 -> Eliminar Cliente "
                    + "\n6 -> Modificar Cliente"
                    + "\n7 -> Agregar Vehiculo"
                    + "\n8 -> Eliminar Vehiculo"
                    + "\n9 -> Modificar Vehiculo"
                    + "\n10 -> Compra/Venta de Vehiculos de parte del cliente"
                    + "\n0-> Salir"
                    + "\nIngrese la opcion que desea:");

            res = leer.nextInt();
            switch (res) {
                case 7: {
                    System.out.println("Ingrese Color");
                    String colores = leer.next();
                    System.out.println("Ingrese la marca de su Vehiculo: ");
                    String marca = leer.next();
                    System.out.println("Ingrese el año del Vehiculo: ");
                    int Año = leer.nextInt();
                    System.out.println("Ingrese el precio de su vehiculo");
                    double price = leer.nextDouble();
                    System.out.println("Ingrese la cantidad de llantas en su vehiculo: ");
                    int llantas = leer.nextInt();
                    System.out.println("Ingrese el tipo de carro \n1.Carro \n2.Moto \n 3.Bicicleta \n 4.Bus \n 5.Camion");
                    int resp = leer.nextInt();
                    switch (resp) {
                        case 1: {
                            System.out.println("Ingrese la cantidad de puertas: ");
                            int puertas = leer.nextInt();
                            System.out.println("Ingrese el tipo de motor: ");
                            String motor = leer.next();
                            System.out.println("Ingrese velocidad Maxima: ");
                            double velocidad = leer.nextDouble();
                            Carro_1 auto = new Carro_1(puertas, motor, velocidad, colores, marca, Año, price, llantas);
                            String no = "";
                            for (int i = 0; i < empresa.size(); i++) {
                                no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                            }
                            System.out.println(no + "\n Seleccione la concesionaria que desea agregar el carro: ");
                            int pos = leer.nextInt();
                            empresa.get(pos - 1).getCarros().add(auto);
                        }

                        break;
                        case 2: {
                            String motor = "";
                            System.out.println("Ingrese el desplazamiento: ");
                            double des = leer.nextDouble();
                            System.out.println("La motocicleta es eléctrica? (Sí/No):");
                            String respuestaElectrica = leer.next().toLowerCase();

                            boolean esElectrica;
                            while (true) {
                                if (respuestaElectrica.equals("sí") || respuestaElectrica.equals("si")) {
                                    esElectrica = true;
                                    motor += "electrico";
                                    break;
                                } else if (respuestaElectrica.equals("no")) {
                                    esElectrica = false;
                                    motor += "gasolina";
                                    break;
                                } else {
                                    System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
                                    respuestaElectrica = leer.next().toLowerCase();
                                }
                            }
                            Moto a = new Moto(des, motor, colores, marca, Año, price, llantas);
                            String no = "";
                            for (int i = 0; i < empresa.size(); i++) {
                                no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                            }
                            System.out.println(no + "\n Seleccione la concesionaria que desea agregar la motocicleta: ");
                            int pos = leer.nextInt();
                            empresa.get(pos - 1).getCarros().add(a);
                        }

                        break;
                        case 3: {
                            String tipo = "";
                            System.out.println("Ingrese la descripcion: ");
                            String desc = leer.next();
                            System.out.println("Ingrese el radio de la rueda:");
                            double radio = leer.nextDouble();
                            System.out.println("La bicicleta es BMX? (Sí/No):");
                            String respuestaBMX = leer.next().toLowerCase();

                            boolean esBMX;
                            while (true) {
                                if (respuestaBMX.equals("sí") || respuestaBMX.equals("si")) {
                                    esBMX = true;
                                    tipo += "BMX";
                                    break;
                                } else if (respuestaBMX.equals("no")) {
                                    esBMX = false;
                                    tipo += "Calle";
                                    break;
                                } else {
                                    System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
                                    respuestaBMX = leer.next().toLowerCase();
                                }
                            }

                            Bicicleta bass = new Bicicleta(desc, radio, tipo, colores, marca, Año, price, llantas);
                            String no = "";
                            for (int i = 0; i < empresa.size(); i++) {
                                no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                            }
                            System.out.println(no + "\n Seleccione la concesionaria que desea agregar la bicicleta: ");
                            int pos = leer.nextInt();
                            empresa.get(pos - 1).getCarros().add(bass);
                        }
                        break;
                        case 4: {
                            String tipo = "";
                            System.out.println("Ingrese la cantidad de pasajeros: ");
                            int pasajeros = leer.nextInt();
                            boolean verificador;
                            while (true) {
                                if (pasajeros <= 50) {
                                    verificador = true;
                                    tipo += "Rapidito";
                                    break;
                                } else {
                                    verificador = false;
                                    tipo += "de Ruta";
                                    break;

                                }

                            }
                            Bus b = new Bus(pasajeros, tipo, colores, marca, Año, price, llantas);
                            String no = "";
                            for (int i = 0; i < empresa.size(); i++) {
                                no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                            }
                            System.out.println(no + "\n Seleccione la concesionaria que desea agregar el bus: ");
                            int pos = leer.nextInt();
                            empresa.get(pos - 1).getCarros().add(b);
                        }
                        break;
                        case 5: {
                            System.out.println("Ingrese la altura del camion:");
                            double altura = leer.nextDouble();
                            System.out.println("Ingrese la carga maxima del bus:");
                            double max = leer.nextDouble();
                            System.out.println("Tiene retroexcavadora? (Sí/No):");
                            String respuestaBMX = leer.next().toLowerCase();

                            boolean retro;
                            while (true) {
                                if (respuestaBMX.equals("sí") || respuestaBMX.equals("si")) {
                                    retro = true;

                                    break;
                                } else if (respuestaBMX.equals("no")) {
                                    retro = false;

                                    break;
                                } else {
                                    System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
                                    respuestaBMX = leer.next().toLowerCase();
                                }
                            }
                            CamionCarga c = new CamionCarga(altura, retro, max, colores, marca, Año, price, llantas);
                            String no = "";
                            for (int i = 0; i < empresa.size(); i++) {
                                no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                            }
                            System.out.println(no + "\n Seleccione la concesionaria que desea agregar el camion: ");
                            int pos = leer.nextInt();
                            empresa.get(pos - 1).getCarros().add(c);
                        }
                        break;
                        default: {
                            System.out.println("No valido");
                        }
                        break;
                    }
                }
                break;
                case 8: {
//                    System.out.println("Ingrese el tipo de carro \n1.Carro \n2.Moto \n 3.Bicicleta \n 4.Bus \n 5.Camion");
//                    int resp = leer.nextInt();
//                    switch (resp) {
//                        case 1: {
//                            if (car.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < car.size(); i++) {
//                                    no += i + 1 + "\n" + car.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione el carro que desea eliminar: ");
//                                int pos = leer.nextInt();
//                                vehicle.remove(pos - 1);
//
//                            }
//                        }
//
//                        break;
//                        case 2: {
//                            if (motorcycle.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < motorcycle.size(); i++) {
//                                    no += i + 1 + "\n" + motorcycle.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la moto que desea eliminar: ");
//                                int pos = leer.nextInt();
//                                motorcycle.remove(pos - 1);
//
//                            }
//
//                        }
//
//                        break;
//                        case 3: {
//                            if (bike.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < bike.size(); i++) {
//                                    no += i + 1 + "\n" + bike.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la bicicleta que desea eliminar: ");
//                                int pos = leer.nextInt();
//                                bike.remove(pos - 1);
//
//                            }
//                        }
//                        break;
//                        case 4: {
//                            if (bus.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < bus.size(); i++) {
//                                    no += i + 1 + "\n" + bus.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la moto que desea eliminar: ");
//                                int pos = leer.nextInt();
//                                bus.remove(pos - 1);
//
//                            }
//                        }
//                        break;
//                        case 5: {
//                            if (truck.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < truck.size(); i++) {
//                                    no += i + 1 + "\n" + truck.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la Camion que desea eliminar: ");
//                                int pos = leer.nextInt();
//                                truck.remove(pos - 1);
//
//                            }
//
//                        }
//                        break;
//                        default: {
//                            System.out.println("No valido");
//                        }
//                        break;
//                    }
                    String no = "";
                    for (int i = 0; i < empresa.size(); i++) {
                        no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                    }
                    System.out.println(no + "\n Seleccione la concesionaria acceder: ");
                    int pos = leer.nextInt() - 1;
                    System.out.println(empresa.get(pos).getCarros() + "\n \n Ingrese el Vehiculo que desea eliminar: ");
                    int pos2 = leer.nextInt() - 1;
                    empresa.get(pos).getCarros().remove(pos2);
                    System.out.println("Vehiculo eliminado");

                }
                case 9: {
//                    System.out.println("Ingrese el tipo de carro \n1.Carro \n2.Moto \n 3.Bicicleta \n 4.Bus \n 5.Camion");
//                    int resp = leer.nextInt();
//                    switch (resp) {
//                        case 1: {
//                            if (car.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < car.size(); i++) {
//                                    no += i + 1 + "\n" + car.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione el carro que desea editar: ");
//                                int pos = leer.nextInt();
//                                System.out.println("Ingrese Color");
//                                String colores = leer.next();
//                                System.out.println("Ingrese la marca de su Vehiculo: ");
//                                String marca = leer.next();
//                                System.out.println("Ingrese el año del Vehiculo: ");
//                                int Año = leer.nextInt();
//                                System.out.println("Ingrese el precio de su vehiculo");
//                                double price = leer.nextDouble();
//                                System.out.println("Ingrese la cantidad de llantas en su vehiculo: ");
//                                int llantas = leer.nextInt();
//                                System.out.println("Ingrese la cantidad de puertas: ");
//                                int puertas = leer.nextInt();
//                                System.out.println("Ingrese el tipo de motor: ");
//                                String motor = leer.next();
//                                System.out.println("Ingrese velocidad Maxima: ");
//                                double velocidad = leer.nextDouble();
//                                Carro_1 auto = new Carro_1(puertas, motor, velocidad, colores, marca, Año, price, llantas);
//                                car.set(pos - 1, auto);
//                            }
//                        }
//
//                        break;
//                        case 2: {
//                            if (motorcycle.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < motorcycle.size(); i++) {
//                                    no += i + 1 + "\n" + motorcycle.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la moto que desea editar: ");
//                                int pos = leer.nextInt();
//                                System.out.println("Ingrese Color");
//                                String colores = leer.next();
//                                System.out.println("Ingrese la marca de su Vehiculo: ");
//                                String marca = leer.next();
//                                System.out.println("Ingrese el año del Vehiculo: ");
//                                int Año = leer.nextInt();
//                                System.out.println("Ingrese el precio de su vehiculo");
//                                double price = leer.nextDouble();
//                                System.out.println("Ingrese la cantidad de llantas en su vehiculo: ");
//                                int llantas = leer.nextInt();
//                                String motor = "";
//                                System.out.println("Ingrese el desplazamiento: ");
//                                double des = leer.nextDouble();
//                                System.out.println("La motocicleta es eléctrica? (Sí/No):");
//                                String respuestaElectrica = leer.next().toLowerCase();
//
//                                boolean esElectrica;
//                                while (true) {
//                                    if (respuestaElectrica.equals("sí") || respuestaElectrica.equals("si")) {
//                                        esElectrica = true;
//                                        motor += "electrico";
//                                        break;
//                                    } else if (respuestaElectrica.equals("no")) {
//                                        esElectrica = false;
//                                        motor += "gasolina";
//                                        break;
//                                    } else {
//                                        System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
//                                        respuestaElectrica = leer.next().toLowerCase();
//                                    }
//                                }
//                                Moto a = new Moto(des, motor, colores, marca, Año, price, llantas);
//                                motorcycle.set(pos - 1, a);
//
//                            }
//
//                        }
//
//                        break;
//                        case 3: {
//                            if (bike.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < bike.size(); i++) {
//                                    no += i + 1 + "\n" + bike.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la bicicleta que desea editar: ");
//                                int pos = leer.nextInt();
//                                System.out.println("Ingrese Color");
//                                String colores = leer.next();
//                                System.out.println("Ingrese la marca de su Vehiculo: ");
//                                String marca = leer.next();
//                                System.out.println("Ingrese el año del Vehiculo: ");
//                                int Año = leer.nextInt();
//                                System.out.println("Ingrese el precio de su vehiculo");
//                                double price = leer.nextDouble();
//                                System.out.println("Ingrese la cantidad de llantas en su vehiculo: ");
//                                int llantas = leer.nextInt();
//                                String tipo = "";
//                                System.out.println("Ingrese la descripcion: ");
//                                String desc = leer.next();
//                                System.out.println("Ingrese el radio de la rueda:");
//                                double radio = leer.nextDouble();
//                                System.out.println("La motocicleta es BMX? (Sí/No):");
//                                String respuestaBMX = leer.next().toLowerCase();
//
//                                boolean esBMX;
//                                while (true) {
//                                    if (respuestaBMX.equals("sí") || respuestaBMX.equals("si")) {
//                                        esBMX = true;
//                                        tipo += "BMX";
//                                        break;
//                                    } else if (respuestaBMX.equals("no")) {
//                                        esBMX = false;
//                                        tipo += "Calle";
//                                        break;
//                                    } else {
//                                        System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
//                                        respuestaBMX = leer.next().toLowerCase();
//                                    }
//                                }
//
//                                Bicicleta bass = new Bicicleta(desc, radio, tipo, colores, marca, Año, price, llantas);
//                                bike.set(pos - 1, bass);
//
//                            }
//                        }
//                        break;
//                        case 4: {
//                            if (bus.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < bus.size(); i++) {
//                                    no += i + 1 + "\n" + bus.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione el bus que desea editar: ");
//                                int pos = leer.nextInt();
//                                System.out.println("Ingrese Color");
//                                String colores = leer.next();
//                                System.out.println("Ingrese la marca de su Vehiculo: ");
//                                String marca = leer.next();
//                                System.out.println("Ingrese el año del Vehiculo: ");
//                                int Año = leer.nextInt();
//                                System.out.println("Ingrese el precio de su vehiculo");
//                                double price = leer.nextDouble();
//                                System.out.println("Ingrese la cantidad de llantas en su vehiculo: ");
//                                int llantas = leer.nextInt();
//                                String tipo = "";
//                                System.out.println("Ingrese la cantidad de pasajeros: ");
//                                int pasajeros = leer.nextInt();
//                                boolean verificador;
//                                while (true) {
//                                    if (pasajeros <= 50) {
//                                        verificador = true;
//                                        tipo += "Rapidito";
//                                        break;
//                                    } else {
//                                        verificador = false;
//                                        tipo += "de Ruta";
//                                        break;
//
//                                    }
//
//                                }
//                                Bus b = new Bus(pasajeros, tipo, colores, marca, Año, price, llantas);
//                                bus.set(pos - 1, b);
//
//                            }
//                        }
//                        break;
//                        case 5: {
//                            if (truck.isEmpty()) {
//                                System.out.println("Esta vacio");
//                            } else {
//
//                                String no = "";
//                                for (int i = 0; i < truck.size(); i++) {
//                                    no += i + 1 + "\n" + truck.get(i).toString() + "\n";
//                                }
//
//                                System.out.println(no + "\n Seleccione la Camion que desea editar: ");
//                                int pos = leer.nextInt();
//                                System.out.println("Ingrese Color");
//                                String colores = leer.next();
//                                System.out.println("Ingrese la marca de su Vehiculo: ");
//                                String marca = leer.next();
//                                System.out.println("Ingrese el año del Vehiculo: ");
//                                int Año = leer.nextInt();
//                                System.out.println("Ingrese el precio de su vehiculo");
//                                double price = leer.nextDouble();
//                                System.out.println("Ingrese la cantidad de llantas en su vehiculo: ");
//                                int llantas = leer.nextInt();
//                                System.out.println("Ingrese la altura del camion:");
//                                double altura = leer.nextDouble();
//                                System.out.println("Ingrese la carga maxima del bus:");
//                                double max = leer.nextDouble();
//                                System.out.println("Tiene retroexcavadora? (Sí/No):");
//                                String respuestaBMX = leer.next().toLowerCase();
//
//                                boolean retro;
//                                while (true) {
//                                    if (respuestaBMX.equals("sí") || respuestaBMX.equals("si")) {
//                                        retro = true;
//
//                                        break;
//                                    } else if (respuestaBMX.equals("no")) {
//                                        retro = false;
//
//                                        break;
//                                    } else {
//                                        System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
//                                        respuestaBMX = leer.next().toLowerCase();
//                                    }
//                                }
//                                CamionCarga c = new CamionCarga(altura, retro, max, colores, marca, Año, price, llantas);
//                                truck.set(pos - 1, c);
//                            }
//
//                        }
//                        break;
//                        default: {
//                            System.out.println("No valido");
//                        }
//                        break;
//
//                    }

                    String no = "";
                    for (int i = 0; i < empresa.size(); i++) {
                        no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                    }
                    System.out.println(no + "\n Seleccione la concesionaria acceder: ");
                    int pos = leer.nextInt() - 1;
                    System.out.println(empresa.get(pos).getCarros() + "\n \n Ingrese el Vehiculo que desea eliminar: ");
                    int pos2 = leer.nextInt() - 1;
                    Vehiculo t = empresa.get(pos).getCarros().get(pos2);
                    if (t instanceof Carro_1) {
                        System.out.println("Ingrese la cantidad de puertas: ");
                        int puertas = leer.nextInt();
                        System.out.println("Ingrese el tipo de motor: ");
                        String motor = leer.next();
                        System.out.println("Ingrese velocidad Maxima: ");
                        double velocidad = leer.nextDouble();

                        ((Carro_1) empresa.get(pos).getCarros().get(pos2)).setPuertas(puertas);
                        ((Carro_1) empresa.get(pos).getCarros().get(pos2)).setMotor(motor);
                        ((Carro_1) empresa.get(pos).getCarros().get(pos2)).setVelMax(velocidad);
                    } else if (t instanceof Moto) {
                        String motor = "";
                        System.out.println("Ingrese el desplazamiento: ");
                        double des = leer.nextDouble();
                        System.out.println("La motocicleta es eléctrica? (Sí/No):");
                        String respuestaElectrica = leer.next().toLowerCase();

                        boolean esElectrica;
                        while (true) {
                            if (respuestaElectrica.equals("sí") || respuestaElectrica.equals("si")) {
                                esElectrica = true;
                                motor += "electrico";
                                break;
                            } else if (respuestaElectrica.equals("no")) {
                                esElectrica = false;
                                motor += "gasolina";
                                break;
                            } else {
                                System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
                                respuestaElectrica = leer.next().toLowerCase();
                            }
                        }
                        ((Moto) empresa.get(pos).getCarros().get(pos2)).setDesplazamiento(des);
                        ((Moto) empresa.get(pos).getCarros().get(pos2)).setTipomotor(motor);

                    } else if (t instanceof Bicicleta) {
                        String tipo = "";
                        System.out.println("Ingrese la descripcion: ");
                        String desc = leer.next();
                        System.out.println("Ingrese el radio de la rueda:");
                        double radio = leer.nextDouble();
                        System.out.println("La bicicleta es BMX? (Sí/No):");
                        String respuestaBMX = leer.next().toLowerCase();

                        boolean esBMX;
                        while (true) {
                            if (respuestaBMX.equals("sí") || respuestaBMX.equals("si")) {
                                esBMX = true;
                                tipo += "BMX";
                                break;
                            } else if (respuestaBMX.equals("no")) {
                                esBMX = false;
                                tipo += "Calle";
                                break;
                            } else {
                                System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
                                respuestaBMX = leer.next().toLowerCase();
                            }
                        }
                        ((Bicicleta) empresa.get(pos).getCarros().get(pos2)).setDescripcion(desc);
                        ((Bicicleta) empresa.get(pos).getCarros().get(pos2)).setMarca(tipo);
                        ((Bicicleta) empresa.get(pos).getCarros().get(pos2)).setRadiorueda(radio);

                    } else if (t instanceof Bus) {
                        String tipo = "";
                        System.out.println("Ingrese la cantidad de pasajeros: ");
                        int pasajeros = leer.nextInt();
                        boolean verificador;
                        while (true) {
                            if (pasajeros <= 50) {
                                verificador = true;
                                tipo += "Rapidito";
                                break;
                            } else {
                                verificador = false;
                                tipo += "de Ruta";
                                break;

                            }

                        }
                        ((Bus) empresa.get(pos).getCarros().get(pos2)).setPasajeros(pasajeros);
                        ((Bus) empresa.get(pos).getCarros().get(pos2)).setTipoBus(tipo);

                    } else if (t instanceof CamionCarga) {
                        System.out.println("Ingrese la altura del camion:");
                        double altura = leer.nextDouble();
                        System.out.println("Ingrese la carga maxima del bus:");
                        double max = leer.nextDouble();
                        System.out.println("Tiene retroexcavadora? (Sí/No):");
                        String respuestaBMX = leer.next().toLowerCase();

                        boolean retro;
                        while (true) {
                            if (respuestaBMX.equals("sí") || respuestaBMX.equals("si")) {
                                retro = true;

                                break;
                            } else if (respuestaBMX.equals("no")) {
                                retro = false;

                                break;
                            } else {
                                System.out.println("Respuesta inválida. Por favor, ingrese 'Sí' o 'No':");
                                respuestaBMX = leer.next().toLowerCase();
                            }
                        }
                        ((CamionCarga) empresa.get(pos).getCarros().get(pos2)).setAltura(altura);
                        ((CamionCarga) empresa.get(pos).getCarros().get(pos2)).setMaxCarga(max);
                        ((CamionCarga) empresa.get(pos).getCarros().get(pos2)).setRetroex(retro);
                    } else {
                        System.out.println("No valido");
                    }

                }
                case 4: {
                    boolean idRepetido = false;
                    String num = "";
                    do {
                        System.out.println("Ingrese id: ");
                        num = leer.next();
                        for (Cliente cliente : clienteregistrado) {
                            if (num.equals(cliente.getId())) {
                                idRepetido = true;
                                System.out.println("Este codigo ya esta en uso");;
                                break;
                            }
                        }
                    } while (idRepetido);

                    System.out.print("Ingrese el nombre del nuevo cliente: ");
                    String Nombre = leer.next();

                    System.out.print("Ingrese el saldo disponible del nuevo cliente: ");
                    double Saldo = leer.nextDouble();

                    Cliente cl = new Cliente(num, Nombre, Saldo);
                    clienteregistrado.add(cl);
                }
                break;

                case 5: {
                    if (clienteregistrado.isEmpty()) {
                        System.out.println("Esta vacio");
                    } else {
                        String no = "";
                        for (int i = 0; i < clienteregistrado.size(); i++) {
                            no += i + 1 + "\n" + clienteregistrado.get(i).toString() + "\n";
                        }
                        System.out.println(no + "\n Seleccione al cliente que desea eliminar: ");
                        int pos = leer.nextInt();
                        clienteregistrado.remove(pos - 1);
                    }
                }
                break;

                case 6: {
                    if (clienteregistrado.isEmpty()) {
                        System.out.println("Esta vacio");
                    } else {
                        String no = "";
                        for (int i = 0; i < clienteregistrado.size(); i++) {
                            no += i + 1 + "\n" + clienteregistrado.get(i).toString() + "\n";
                        }
                        System.out.println(no + "\n Seleccione al cliente que desea editar: ");
                        int pos = leer.nextInt();
                        boolean idRepetido = false;
                        String num = "";
                        do {
                            System.out.println("Ingrese id: ");
                            num = leer.next();
                            for (Cliente cliente : clienteregistrado) {
                                if (num.equals(cliente.getId())) {
                                    idRepetido = true;
                                    System.out.println("Este codigo ya esta en uso");;
                                    break;
                                }
                            }
                        } while (idRepetido);
                        System.out.print("Ingrese el nombre del nuevo cliente: ");
                        String Nombre = leer.next();

                        System.out.print("Ingrese el saldo disponible del nuevo cliente: ");
                        double Saldo = leer.nextDouble();

                        Cliente cl = new Cliente(num, Nombre, Saldo);
                        clienteregistrado.set(pos - 1, cl);
                    }
                }
                break;

                case 1: {
                    System.out.println("Ingrese el nombre de la concesionaria: ");
                    String name = leer.next();
                    boolean idRepetido = false;
                    String num = "";
                    do {
                        System.out.println("Ingrese id: ");
                        num = leer.next();
                        for (Concesionaria concesionaria : empresa) {
                            if (num.equals(concesionaria.getId())) {
                                idRepetido = true;
                                System.out.println("Este codigo ya esta en uso");;
                                break;
                            }
                        }
                    } while (idRepetido);
                    System.out.println("Ingrese la direccion del lugar: ");
                    String dir = leer.next();
                    System.out.println("Ingrese el saldo: ");
                    double money = leer.nextDouble();
                    Concesionaria con = new Concesionaria(num, name, dir, money);
                    empresa.add(con);
                }
                break;

                case 2: {
                    if (empresa.isEmpty()) {
                        System.out.println("Esta vacio");
                    } else {
                        String no = "";
                        for (int i = 0; i < empresa.size(); i++) {
                            no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                        }
                        System.out.println(no + "\n Seleccione la concesionaria que desea eliminar: ");
                        int pos = leer.nextInt();
                        empresa.remove(pos - 1);
                    }
                }
                break;
                case 3: {
                    if (empresa.isEmpty()) {
                        System.out.println("Esta vacio");
                    } else {
                        String no = "";
                        for (int i = 0; i < empresa.size(); i++) {
                            no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                        }
                        System.out.println(no + "\n Seleccione la concesionaria que desea editar: ");
                        int pos = leer.nextInt();
                        System.out.println("Ingrese el nombre de la concesionaria: ");
                        String name = leer.next();
                        boolean idRepetido = false;
                        String num = "";
                        do {
                            System.out.println("Ingrese id: ");
                            num = leer.next();
                            for (Concesionaria concesionaria : empresa) {
                                if (num.equals(concesionaria.getId())) {
                                    idRepetido = true;
                                    System.out.println("Este codigo ya esta en uso");;
                                    break;
                                }
                            }
                        } while (idRepetido);
                        System.out.println("Ingrese la direccion del lugar: ");
                        String dir = leer.next();
                        System.out.println("Ingrese el saldo: ");
                        double money = leer.nextDouble();
                        Concesionaria con = new Concesionaria(num, name, dir, money);
                        empresa.set(pos - 1, con);
                    }
                }
                break;

                case 10: {
                    System.out.println("¿Quiere comprar o vender?");
                    String resul = leer.next().toLowerCase();
                    switch (resul) {
                        case "comprar": {
                            if (empresa.isEmpty()) {
                                System.out.println("Esta vacio");
                            } else {
                                String no = "";
                                for (int i = 0; i < empresa.size(); i++) {
                                    no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                                }
                                System.out.println(no + "\n Seleccione la concesionaria que desea elegir: ");
                                int pos = leer.nextInt()-1;
                                Concesionaria cons = empresa.get(pos);
                                System.out.println(empresa.get(pos).getCarros() + "\n \n Ingrese el Vehiculo que desea comprar: ");
                                int pos2 = leer.nextInt()-1 ;
                                String no2 = "";
                                for (int i = 0; i < clienteregistrado.size(); i++) {
                                    no2 += i + 1 + "\n" + clienteregistrado.get(i).toString() + "\n";
                                }
                                System.out.println(no2 + "\n Seleccione al cliente : ");
                                int pos3 = leer.nextInt()-1;
                                Cliente comprador= clienteregistrado.get(pos3);
                                 double prfinal = cons.getCarros().get(pos2).getPrecio()+(cons.getCarros().get(pos2).getPrecio()* 0.075);
                                  System.out.println("Precio inicial:" +cons.getCarros().get(pos2).getPrecio());
                                    System.out.println("Precio final:" + prfinal);
                                    System.out.println("¿Quiere comprarlo? si/no:");
                                    String comp=leer.next().toLowerCase();
                                    if (comp.equals("si")) {
                                        if (comprador.getSaldoDisponible()>= prfinal) {
                                            comprador.setSaldoDisponible(comprador.getSaldoDisponible()-prfinal);
                                            comprador.getVehiculos().add(cons.getCarros().get(pos2));
                                            cons.setSaldo(cons.getSaldo()+prfinal);
                                            cons.getCarros().remove(pos2);
                                        }else{
                                            System.out.println("No tiene dinero");
                                        }
                                    
                                }
                            }
                        }
                        break;
                        case "vender": {
                            String no2="";
                            for (int i = 0; i < clienteregistrado.size(); i++) {
                                    no2 += i + 1 + "\n" + clienteregistrado.get(i).toString() + "\n";
                                }
                                System.out.println(no2 + "\n Seleccione al cliente : ");
                                int pos3 = leer.nextInt();
                                Cliente nuevo= clienteregistrado.get(pos3);
                                if (nuevo.getVehiculos().size() == 0) {
                                System.out.println("El cliente no tiene ningun tipo de vehiculo");
                                break;
                            }
                                String no3="";
                            for (int i = 0; i < clienteregistrado.size(); i++) {
                                    no3 += i + 1 + "\n" + clienteregistrado.get(i).getVehiculos().toString() + "\n";
                                }
                                System.out.println(no3 + "\n Seleccione el carro que le queire vender : ");
                                int pos4 = leer.nextInt();
                                  String no = "";
                                for (int i = 0; i < empresa.size(); i++) {
                                    no += i + 1 + "\n" + empresa.get(i).toString() + "\n";
                                }
                                System.out.println(no + "\n Seleccione la concesionaria que desea elegir: ");
                                int pos = leer.nextInt()-1;
                                
                                Concesionaria cons= empresa.get(pos);
                                 if(cons.getSaldo() >= nuevo.getVehiculos().get(pos4).getPrecio()){
                                cons.setSaldo(cons.getSaldo() - nuevo.getVehiculos().get(pos4).getPrecio());
                                cons.getCarros().add(nuevo.getVehiculos().get(pos4));
                                nuevo.setSaldoDisponible(nuevo.getSaldoDisponible() + nuevo.getVehiculos().get(pos4).getPrecio());
                                nuevo.getVehiculos().remove(nuevo.getVehiculos().get(pos4));
                                
                            }else{
                                System.out.println("La concesionaria no tiene saldo para realizar esta compra");
                            }
                                  break;
                        }
                        default: {
                            System.out.println("No Valido");
                        }
                        break;
                    }
                    
                    

                }
                break;
                case 0: {
                    System.out.println("Adios....");
                }
                break;
            }
        } while (res != 0);
    }
}
