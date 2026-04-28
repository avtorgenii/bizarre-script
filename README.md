# Overview
This repo contains source code for ANTLR-based interpreter of language with anime-inspired syntax - `Bizarre Script`.

It is **absolutely** recomended for files with bizarre code to have `.1000-7` extension

# Run
To run program written in `Bizarre Script`
```bash
java -jar bizarre-script.jar <path_to_file_with_code>
```

# Example of program in `Bizarre Script`
```python
DOMAIN_EXPANSION

KO_RE_WA_REQUIEM func () {
    DATTEBAYO "1000-7?";
    bool a DESU 1;
    DATTEBAYO 2;
    ARRIVEDERCI 5;
}

int x DESU func ();

DATTEBAYO x;

string input DESU ZAWARUDO "BAKA!";
DATTEBAYO input;


KO_RE_WA_REQUIEM paramful (x, y, z) {
    DATTEBAYO x;
    DATTEBAYO y;
    DATTEBAYO z;
}

paramful (1, 2, 3);

ORAORAORA (int i DESU 0; i < 5; i DESU i + 1;) {
    DATTEBAYO i;
}

ORAORAORA (int j DESU 0; j < 3; j PLUS_ULTRA;) {
    DATTEBAYO "test ++: " + j;
}

ORAORAORA (int k DESU 5; k > 2; k MUDA;) {
    DATTEBAYO "test --: " + k;
}

list lista DESU [11, "22", "33"];

DATTEBAYO lista;

int test DESU lista[1];
DATTEBAYO "Wybrano: " + test;

OMAE_WA_MOU_SHINDEIRU
```