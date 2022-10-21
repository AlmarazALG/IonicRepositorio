export class Sala{
    private _id: number;
    private _numeroS: number;
    private _totalA: number;
    private _fechaA: string;
    private _fechaM: string;
    private _activo: boolean;
  
    constructor() {
      this._id = null;
      this._numeroS = null;
      this._totalA = null;
      this._fechaA = null;
      this._fechaM = null;
      this._activo = null;
    }

    public get id() : number {
        return this._id;
    }
    public set id(v : number) {
        this._id = v;
    }

    public get numeroS() : number {
        return this._numeroS;
    }
    public set numeroS(v : number) {
        this._numeroS = v;
    }

    public get totalA() : number {
        return this._totalA;
    }
    public set totalA(v : number) {
        this._totalA = v;
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