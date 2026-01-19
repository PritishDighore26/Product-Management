import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { Product } from '../../service/product';

@Component({
  selector: 'app-post-product',
  imports: [RouterModule,CommonModule,ReactiveFormsModule],
  templateUrl: './post-product.html',
  styleUrl: './post-product.css',
})
export class PostProduct {

  postProductForm!:FormGroup;

  constructor(private productService:Product,private fb:FormBuilder ){}

  ngOnInit(){
    this.postProductForm=this.fb.group({
      name:[null,[Validators.required]],
      price:[null,[Validators.required]]
    })
  }

  postProduct() {
    console.log(this.postProductForm.value);
    this.productService.postProduct(this.postProductForm.value).subscribe((res) => {
    console.log(res);
    });
    this.postProductForm.reset();
  }
   
  
}
