<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>freemarker?!!!!</title>
</head>
<body>
${name}

<#if sex=='0'>
    <p>男</p>
<#elseif sex=='1'>
    <p>女</p>
<#else>
    <p>未知</p>
</#if>
<#if age gt 18>
<p>成年</p>
<#else>
    <p>未成年</p>
</#if>
<#list userlist as user>
    <p>${user}</p>
</#list>
</body>
</html>