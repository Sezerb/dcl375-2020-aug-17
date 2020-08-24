const express = require('express');
const app = express();

//Serve public static files.
app.use("/", express.static(__dirname + '/public'));

app.get("/", function(req,res){
    res.render("index");
})

app.listen(3000,function(error){
    if(error == true){
        console.log("some error occured");
    }else{
        console.log("listening on localhost:3000");
    }
})