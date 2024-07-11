<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">GUÍA DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Algoritmo de Compresión de Huffman</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>08</td><td>AÑO LECTIVO:</td><td>2024 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>11-Julio-2024</td><td>FECHA FIN:</td><td>11-Julio-2024</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">RECURSOS:
    <ul>
        <li>https://www.w3schools.com/java/</li>
        <li>https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers</li>
        <li>https://docs.oracle.com/javase/7/docs/api/java/util/List.html</li>
        <li>https://docs.oracle.com/javase/tutorial/java/generics/types.html</li>
    </ul>
</td>
</<tr>
<tr><td colspan="6">DOCENTES:
<ul>
<li>Edson Luque Mamani</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

# Revisión de elementos de programación

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]

[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

#

## OBJETIVOS TEMAS Y COMPETENCIAS

### OBJETIVOS
- Realizar ejercicios en temas de Estructuras de datos, tipos de datos abstractos, bucles, Arrays, Algoritmo de Compresión de Huffman.

### TEMAS
- Algoritmo de Compresión de Huffman

<details>
<summary>COMPETENCIAS</summary>

- C.m. Construye responsablemente soluciones haciendo uso de estructuras de datos y algoritmos, siguiendo un proceso adecuado para resolver problemas computacionales que se ajustan al uso de los recursos disponibles y a especificaciones concretas.

</details>

# TAREA
1. Elabore un informe paso a paso de la implementación del algoritmo de compresión mediante el algoritmo de Huffman.

### MARCO CONCEPTUAL
1. Algoritmo de compresión de Huffman

Se trata de un algoritmo que puede ser usado para compresión o encriptación de datos. Este algoritmo se basa en asignar códigos de distinta longitud de bits a cada uno de los caracteres de un fichero. 
Si se asignan códigos más cortos a los caracteres que aparecen más a menudo se consigue una compresión del fichero.
Esta compresión es mayor cuando la variedad de caracteres diferentes que aparecen es menor.
Por ejemplo: si el texto se compone  únicamente de números o mayúsculas, se conseguirá una compresión mayor.

Para recuperar el fichero original es necesario conocer el código asignado a cada caracter, así como su longitud en bits, si  ésta información se omite, y el receptor del fichero la conoce, podrá recuperar la información original. De este modo es posible utilizar el algoritmo para encriptar ficheros.

2. Mecanismo del algoritmo
Contar cuantas veces aparece cada caracter en el fichero a comprimir. Y crear una lista enlazada con la información de caracteres y frecuencias.
Ordenar la lista de menor a mayor en función de la frecuencia.
Convertir cada elemento de la lista en un árbol.
Fusionar todos estos  árboles en uno  único, para hacerlo se sigue el siguiente proceso, mientras la lista de  árboles contenga más de un elemento:
-------• Con los dos primeros árboles formar un nuevo  árbol, cada uno de los  árboles originales en una rama.
-------• Sumar las frecuencias de cada rama en el nuevo elemento árbol.
-------• Insertar el nuevo  árbol en el lugar adecuado de la lista según la suma de frecuencias obtenida.
Para asignar el nuevo código binario de cada caracter sólo hay que seguir el camino adecuado através del árbol. 
Si se toma una rama cero, se añade un cero al código, si se toma una rama uno, se añade un uno.
Se recodifica el fichero según los nuevos códigos.
3 Veamos un ejemploTomemos un texto corto, por ejemplo: "ata la jaca a la estaca”
3.1. Contamos las veces que aparece cada caracter y hacemos una lista enlazada: ’  ’(5), a(9), c(2), e(1), j(1), l(2), s(1), t(2)
3.2. Ordenamos por frecuencia de menor a mayor: e(1), j(1), s(1), c(2), l(2), t(2), ’  ’(5), a(9)
3.3. Consideremos ahora que cada elemento es el nodo raíz de un árbol.
3.4. Fusionamos los dos primeros nodos ( árboles) en un nuevo  árbol, sumamos sus frecuencias y lo colocamos en el lugar correspondiente:
3.5. Asignamos los códigos, las ramas a la izquierda son ceros, y a la derecha unos, es una regla arbitraria.

- https://www.w3schools.com/java/
- https://docs.oracle.com/javase/tutorial/java/generics/types.html

## IDE 
Para los laboratorios usando el lenguaje Java se recomienda usar el siguiente IDE-online 
[http:cs50.dev](https://cs50.dev)

- necesita una cuenta github
- para compilar use:
- $javac hello.java
- $java hello

## Algoritmo de Compresión de Huffman
Un árbol Trie, o árbol de prefijos, es una estructura de datos que almacena cadenas de manera eficiente compartiendo prefijos comunes.



## REFERENCIAS
    - https://conclase.net/blog/item/huffman
    - https://www.youtube.com/watch?v=fUpZ05dNZdE
    - https://www.w3schools.com/java/
    - https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
    - https://docs.oracle.com/javase/7/docs/api/java/util/List.html
    - https://docs.oracle.com/javase/tutorial/java/generics/types.html
#

[license]: https://img.shields.io/github/license/rescobedoq/pw2?label=rescobedoq
[license-file]: https://github.com/rescobedoq/pw2/blob/main/LICENSE

[downloads]: https://img.shields.io/github/downloads/rescobedoq/pw2/total?label=Downloads
[releases]: https://github.com/rescobedoq/pw2/releases/

[last-commit]: https://img.shields.io/github/last-commit/rescobedoq/pw2?label=Last%20Commit

[Debian]: https://img.shields.io/badge/Debian-D70A53?style=for-the-badge&logo=debian&logoColor=white
[debian-site]: https://www.debian.org/index.es.html

[Git]: https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white
[git-site]: https://git-scm.com/

[GitHub]: https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white
[github-site]: https://github.com/

[Vim]: https://img.shields.io/badge/VIM-%2311AB00.svg?style=for-the-badge&logo=vim&logoColor=white
[vim-site]: https://www.vim.org/

[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white
[java-site]: https://docs.oracle.com/javase/tutorial/


[![Debian][Debian]][debian-site]
[![Git][Git]][git-site]
[![GitHub][GitHub]][github-site]
[![Vim][Vim]][vim-site]
[![Java][Java]][java-site]

[![License][license]][license-file]
[![Downloads][downloads]][releases]
[![Last Commit][last-commit]][releases]