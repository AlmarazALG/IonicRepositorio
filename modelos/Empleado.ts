import {Area} from './Area';

export class Empleado{
  private _apellido: string;
  private _area: Area;
  private _empleado: string;
  private _empleadoId: number;
  private _fecha: string;
  private _activo: boolean;


  constructor() {
    this._apellido = null;
    this._area = null;
    this._empleado = null;
    this._empleadoId = null;
    this._fecha = null;
    this._activo = null;
  }

  get apellido(): string {
    return this._apellido;
  }

  set apellido(value: string) {
    this._apellido = value;
  }

  get area(): Area {
    return this._area;
  }

  set area(value: Area) {
    this._area = value;
  }

  get empleado(): string {
    return this._empleado;
  }

  set empleado(value: string) {
    this._empleado = value;
  }

  get empleadoId(): number {
    return this._empleadoId;
  }

  set empleadoId(value: number) {
    this._empleadoId = value;
  }

  get fecha(): string {
    return this._fecha;
  }

  set fecha(value: string) {
    this._fecha = value;
  }


  get activo(): boolean {
    return this._activo;
  }

  set activo(value: boolean) {
    this._activo = value;
  }
}
