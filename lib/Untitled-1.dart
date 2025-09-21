import 'package:flutter/material.dart';

void main(){
    runApp(const MyApp());
}

class MyApp extends statelesswidget{
  const MyApp({super.key});

  @override
  widget build(buildcontext context){
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home; MyFirstApp(),
    );
}


class MyFirstApp ectends statelessWidget{
  const MyFirstApp({super.key});

  @override 
  Widget Build(Buildcontext context){
    return Scaffold(
      appbar: Appbar(
        backgroundcolour: Colors.blue,
        title: Text("Whatsapp"),
        leading: IconButton(onPressed: (){}, Icon; Icon(Icons.search)),
        actions; [Icon(Icons,camera_enhance)],
      ),
      
    )
  }
}
  
    
}
}