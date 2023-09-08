<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <h1>Ajax를 이용해 실시간 순위 나타내기</h1>
    <table border="1">
      <tr>
        <th>실시간 검색 순위</th>
        <th>키워드</th>
      </tr>
      <tr>
        <td id="td1">순위</td>
        <td id="td2">키워드</td>
      </tr>
    </table>
    <script>
      let obj = "";
      let word = new Array();
      let rank;
      let name;
      let a = 0;
      let xhr = new XMLHttpRequest();
      xhr.open("GET", "data2.json", true);
      xhr.send();
      xhr.onreadystatechange = function () {
        // 응답
        if (xhr.readyState == XMLHttpRequest.DONE && xhr.status == 200) {
          //   alert(JSON.parse(xhr.responseText));
          obj = JSON.parse(xhr.responseText);
          //alert(obj);
          // 파싱된 obj에서 search_word라는 key를 가지고
          // value값을 꺼내오면
          // [{},{},{},{},{}] 가 나온다.(즉, 배열이다.)

          for (let i = 0; i < obj.search_word.length; i++) {
            word[i] = obj.search_word[i].name;
          }

          let i = 0; // 순위
          setInterval(function () {
            // json안에 있는 search_word 배열의 길이가
            // 0,1,2,3,4 > 5가 되는 순간 다시 0이 된다.
            i = i % obj.search_word.length;
            document.getElementById("td1").innerHTML = i + 1;
            document.getElementById("td2").innerHTML = word[i];
            i++;
          }, 2000);

          setTimeout(function () {
            clearInterval(interval);
          }, 10000);

          // setInterval(function () {
          //   rank = obj.search_word[a].rank;
          //   name = obj.search_word[a].name;
          //   document.getElementById("td1").innerHTML = rank;
          //   document.getElementById("td2").innerHTML = name;
          //   a++;

          //   if (a == 5) {
          //     a = 0;
          //   }
          // }, 1000);
        }
      };
    </script>
  </body>
</html>
