# coding-assignment
Project created for coding assignment



        Designing RESTFUL WEBSERVICE :
        First define a REST resource to GET list of all animals
          http://www.singtel.com/animals
        Next define a REST resource to GET details of an animal (Ex: Duck)
          http://www.singtel.com/animals/duck
        Representations:
        Here is a XML respresentation of GET response
          <animal>
          <type>bird</type>
          <name>duck</name>
          <swim>I am swimming</swim>
          <walk>I am walking</walk>
          <sing>Quack, quack</sing>
          <fly>I am flying</fly>
          </animal>
          OR
         A JSON respresentation of GET response
        {"animal":{"type":"bird","name":"duck","swim":"I am swimming","walk":"I am walking","sing":"Quack, quack","fly":"I am         flying"}}
