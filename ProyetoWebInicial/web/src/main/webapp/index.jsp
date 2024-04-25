<!doctype html>
<!--Doctype: le indica al navegador el tipo de documento a mostrar-->
<html lang="es"><!--lang=es lenguaje,estamos indicando que queremos idioma español-->
<head><!-- Es el encabezado del documento-->
    <meta charset="UTF-8"><!--esto es para la conversión de idioma para los acentos o ñ española-->
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="author" content="Isabel García">
    <meta name="Keyworks" content="Html,jps.Java">
    <title>Mi PRIMER JSP con HTML</title><!--Se considera obligatorio ponerle titulo a cada página-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
</head>

<body>
<div>
    <button>Inicio</button>
    <button>Menu</button>
</div>
<div>
    <a href="index.jsp"><span class="material-symbols-outlined">
home
</span></a>
    <a href="ListasYtablas.jsp"><span class="material-symbols-outlined">
format_list_bulleted
</span></a>
    <a href="Formularios.jsp"><span class="material-symbols-outlined">
contract_edit
</span></a>

</div>
<h1> Encabezado H1</h1>
<h2> Encabezado H2</h2>
<h3> Encabezado H3</h3>
<h4> Encabezado H4</h4>
<h5> Encabezado H5</h5>
<h6> Encabezado H6</h6>

<p>
    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab alias aperiam dolor eligendi et explicabo facere hic illum incidunt laborum, minima pariatur quam quod, soluta veniam! Hic quidem quos temporibus!
    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ad assumenda debitis dignissimos eius eum fugit impedit in ipsam labore maiores minus, odit pariatur, perferendis quidem quo sunt, tempora velit! Labore!
    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Architecto blanditiis eaque, explicabo facere laudantium quam quas quis quod sint, vel velit, voluptatum! Autem doloremque facilis fugiat libero modi nam similique.
</p>
<p> Lorem ipsum dolor sit amet, consectetur adipisicing elit. Alias aliquam amet blanditiis consectetur consequatur eligendi eveniet hic incidunt inventore ipsum iure labore maiores nam quidem quisquam quo sint tempore, voluptates!
</p>
<div>
    <img src="Views/images/SuperMan.jpg" alt="Poster de la película Superman">
</div>
<hr>

<img src="Views/images/LogoSuperMan.jpg"alt="=Logo Superman">
<video src="Views/video/TrailerSuper.mp4"autoplay controls muted loop ></video>
<iframe width="560" height="315" src="https://www.youtube.com/embed/kwPjIkusdcE?si=m-IRP0E-RnMRS0LY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d98992.98152471693!2d-3.1051724770447082!3d39.16265509117225!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0xd68fc7957b0bb75%3A0xad9d7d14ed65567f!2sCentro%20de%20Estudios%20CEAT%20S.L.!5e0!3m2!1ses!2ses!4v1713975087168!5m2!1ses!2ses" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
<hr>
<h1>Audio</h1>
<audio src="Views/audio/BandaSonor.ogg" controls muted autoplay></audio>
<h1>Enlaces</h1>
<a href="ListasYtablas.jsp">Ir a Istas y Tablas</a>
</body>
</html>