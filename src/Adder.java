/* Generated By:JavaCC: Do not edit this line. Adder.java */
        public class Adder implements AdderConstants {
            private Integer valx;
            private Integer valy;
            private Integer valz;

            public Adder(Integer valx,Integer valy,Integer valz){
                this.valx=valx;
                this.valy=valy;
                this.valz=valz;
            }

           public Integer getValx(){
            return this.valx;
           }
           public Integer getValy(){
            return this.valy;
           }
            public Integer getValz(){
            return this.valz;
           }

  final public void Start() throws ParseException {
               Adder letras; Integer resultadoFinal;
    letras = Z();
    resultadoFinal = X(letras);
                                        System.out.println("El resultado es: "+resultadoFinal);
  }

  final public Adder Z() throws ParseException {
           Token valx;Token valy;Token valz;
    jj_consume_token(LETRAX);
    jj_consume_token(IGUAL);
    valx = jj_consume_token(NUMBER);
    jj_consume_token(COMA);
    jj_consume_token(LETRAY);
    jj_consume_token(IGUAL);
    valy = jj_consume_token(NUMBER);
    jj_consume_token(COMA);
    jj_consume_token(LETRAZ);
    jj_consume_token(IGUAL);
    valz = jj_consume_token(NUMBER);
    jj_consume_token(PUNTOCOMA);
                                                                                                                            {if (true) return new Adder(Integer.parseInt(valx.image),Integer.parseInt(valy.image),Integer.parseInt(valz.image));}
    throw new Error("Missing return statement in function");
  }

  final public int X(Adder letras) throws ParseException {
                     Integer numero; Integer resultado;
    numero = T(letras);
    resultado = XP(numero, letras);
                                                   {if (true) return resultado;}
    throw new Error("Missing return statement in function");
  }

  final public int XP(int val, Adder letras) throws ParseException {
                               Integer numero; Integer resultado;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MAS:
      jj_consume_token(MAS);
      numero = T(letras);
      resultado = XP(val+numero, letras);
                                                             {if (true) return resultado;}
      break;
    case MENOS:
      jj_consume_token(MENOS);
      numero = T(letras);
      resultado = XP(val-numero,letras);
                                                              {if (true) return resultado;}
      break;
    default:
      jj_la1[0] = jj_gen;
         {if (true) return val;}
    }
    throw new Error("Missing return statement in function");
  }

  final public int T(Adder letras) throws ParseException {
                     Integer numero; Integer resultado;
    numero = F(letras);
    resultado = TP(numero,letras);
                                                   {if (true) return resultado;}
    throw new Error("Missing return statement in function");
  }

  final public int TP(Integer val,Adder letras) throws ParseException {
                                  Integer numero;Integer resultado;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MUL:
      jj_consume_token(MUL);
      numero = F(letras);
      resultado = TP(val*numero,letras);
                                                          {if (true) return resultado;}
      break;
    case DIV:
      jj_consume_token(DIV);
      numero = F(letras);
      resultado = TP(val/numero,letras);
                                                              {if (true) return resultado;}
      break;
    default:
      jj_la1[1] = jj_gen;
       {if (true) return val;}
    }
    throw new Error("Missing return statement in function");
  }

  final public int F(Adder letras) throws ParseException {
                     Token numero;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMBER:
      numero = jj_consume_token(NUMBER);
                     {if (true) return Integer.parseInt(numero.image);}
      break;
    case LETRAX:
      jj_consume_token(LETRAX);
               {if (true) return letras.getValx();}
      break;
    case LETRAY:
      jj_consume_token(LETRAY);
               {if (true) return letras.getValy();}
      break;
    case LETRAZ:
      jj_consume_token(LETRAZ);
               {if (true) return letras.getValz();}
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public AdderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[3];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x60,0x180,0x8e00,};
   }

  /** Constructor with InputStream. */
  public Adder(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Adder(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AdderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Adder(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AdderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Adder(AdderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AdderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 3; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List jj_expentries = new java.util.ArrayList();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[19];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 3; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 19; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

        }
