// # nodejs学习模板
console.log("hello world nodejs");

// 引入http模块
const http = require('http'); 
http.createServer(function (request, response) {
  // 设置响应头
  response.writeHead(200, {'Content-Type': "text/html;charset=utf-8"}); //utf-8去掉单引号就不乱码
  // 给页面写入内容
  response.write("This is nodejs 你好nodejs")
  // 结束响应
  response.end();
}).listen(8081);

console.log('Server running at http://127.0.0.1:8081/');