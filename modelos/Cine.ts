export class Cine{
  private _id: number;
  private _nombre: string;
  private _fechaA: string;
  private _fechaM: string;
  private _activo: boolean;

  constructor() {
    this._id = null;
    this._nombre = null;
    this._fechaA = null;
    this._fechaM = null;
    this._activo = null;
  }

  public get id() : number {
    return this._id;
  }
  public set id(value : number) {
    this._id = value;
  }

  public get nombre() : string {
    return this._nombre;
  }
  public set nombre(v : string) {
    this._nombre = v;
  }

  public get fechaA() : string {
    return this._fechaA;
  }
  public set fechaA(v : string) {
    this._fechaA = v;
  }
  
  public get fechaM() : string {
    return this._fechaM;
  }
  public set fechaM(v : string) {
    this._fechaM = v;
  }
  
  public get activo() : boolean {
    return this._activo;
  }
  public set activo(v : boolean) {
    this._activo = v;
  }
}
