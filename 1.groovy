"${file("nadir")}"  //function in terraform




variable   name {
   type     = "string"   // regular string in terraform 
}



variable name {
  type    = "map"        // regular mapping in terraform key and values   
  {
      appname = "artemis"
  }
}

variable name {        //list in terraform
    type  = "list"  
    [
        "nadir", "kakoev" ,"temurovich"
    ]
}


variable name  {           // yes no booliens       
    type    = "bool"
    default  = true

}


// GROOVY


def name = "nadir"  // define the name of the variable and value itself
println(name)


def names = ["nadir","kakoev","temurovich"]  // list of information in groovy
println(nmes)


def myInfo = ["first_name": "Nadir" ,
"Last_name" : "Kakoev"
  ]                                         // mapping in groovy
println(myInfo) 



def debugMode = false     // boolien in groovy variable.


def sayHello()  {           // functions in groovy  defining fuction 
    println('Hello World')
}


sayHello()      // calling function ,otherwise wont work in groovy