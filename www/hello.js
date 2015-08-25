module.exports={
	greet=function(name,success,err){
		cordova.exec(success,err,"Hello","greet",[name]);
	}
}
