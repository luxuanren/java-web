/**
 * Created by exuanlu on 9/3/2016.
 */
$(function () {

	var usernameLength = 1;
	var passwordLength = 1;
    $('.required').each(function () {
        var $required = $('<i class="high">*</i>');
        $(this).parent().append($required);
    });
    $('form :input').blur(function () {
        var $parent = $(this).parent();
        var errorMsg;
        var okMsg;
        if ($(this).is('#username')){
            if (this.value == "" || this.value.length < usernameLength){
                errorMsg = "请输入至少" + usernameLength + "位用户名";
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onError">' + errorMsg + '</span>');
            }else {
                okMsg = "用户名合法";
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onSuccess">' + okMsg + '</span>');
            }
        }else if ($(this).is('#email')){
            if( this.value=="" || ( this.value!="" && !/.+@.+\.[a-zA-Z]{2,4}$/.test(this.value) ) ){
                errorMsg = '请输入正确的E-Mail地址';
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onError">'+errorMsg+'</span>');
            }else{
                okMsg = '输入正确.';
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onSuccess">'+okMsg+'</span>');
            }
        } else if($(this).is('#password')) {
            if (this.value == "" || this.value.length < passwordLength){
                errorMsg = "请输入至少" + passwordLength + "位密码";
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onError">' + errorMsg + '</span>');
            }else {
                okMsg = "密码合法";
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onSuccess">' + okMsg + '</span>');
            }
        }else if($(this).is('#confirmPassword')) {
            if ( $('#password').val().length == 0 || this.value != $('#password').val()){
                errorMsg = "两次输入的密码不一致";
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onError">' + errorMsg + '</span>');
            }else {
                okMsg = "确认密码通过";
                $parent.find('.formtips').remove();
                $parent.append('<span class="formtips onSuccess">' + okMsg + '</span>');
            }
        }
    });

    $('#submitbtn').click(function () {
        $('form .required:input ').trigger('blur');
        if ($('.onError').length){
            return false;
        }
    });
});