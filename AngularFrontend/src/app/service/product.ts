import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


const Basic_Url=["http://localhost:8080"]

@Injectable({
  providedIn: 'root',
})
export class Product {
  constructor(private http:HttpClient){}

  postProduct(product: any):Observable<any>{
    return this.http.post(Basic_Url + "/product",product);
  }
}
