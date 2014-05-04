var zfbpay = {
    pay: function(params, success, failure) {
        cordova.exec(
            success, // success callback function
            failure, // error callback function
            'zfbpay', // mapped to our native Java class called "CalendarPlugin"
            'pay', // with this action name
            [
				params
			]
        ); 
    }
}
module.exports = zfbpay;