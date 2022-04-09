<?php
fscanf(STDIN, "%d", $n);
while ($n--) {
    fscanf(STDIN, "%s", $s);
    $arr = str_split($s);
    echo(count($arr)."\n");
}