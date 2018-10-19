package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenLexer extends Lexer {
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int RULE_PERCENTAGE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int RULE_FLOAT=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalVideoGenLexer() {;} 
    public InternalVideoGenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVideoGenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalVideoGen.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:11:7: ( 'TOP' )
            // InternalVideoGen.g:11:9: 'TOP'
            {
            match("TOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:12:7: ( 'BOTTOM' )
            // InternalVideoGen.g:12:9: 'BOTTOM'
            {
            match("BOTTOM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:13:7: ( 'CENTER' )
            // InternalVideoGen.g:13:9: 'CENTER'
            {
            match("CENTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:14:7: ( 'h' )
            // InternalVideoGen.g:14:9: 'h'
            {
            match('h'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:15:7: ( 'horizontal' )
            // InternalVideoGen.g:15:9: 'horizontal'
            {
            match("horizontal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:16:7: ( 'v' )
            // InternalVideoGen.g:16:9: 'v'
            {
            match('v'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:17:7: ( 'vertical' )
            // InternalVideoGen.g:17:9: 'vertical'
            {
            match("vertical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:18:7: ( 'VideoGen' )
            // InternalVideoGen.g:18:9: 'VideoGen'
            {
            match("VideoGen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:19:7: ( '@author' )
            // InternalVideoGen.g:19:9: '@author'
            {
            match("@author"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:20:7: ( '@version' )
            // InternalVideoGen.g:20:9: '@version'
            {
            match("@version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:21:7: ( '@creation' )
            // InternalVideoGen.g:21:9: '@creation'
            {
            match("@creation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:22:7: ( 'mandatory' )
            // InternalVideoGen.g:22:9: 'mandatory'
            {
            match("mandatory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:23:7: ( 'optional' )
            // InternalVideoGen.g:23:9: 'optional'
            {
            match("optional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:24:7: ( 'alternatives' )
            // InternalVideoGen.g:24:9: 'alternatives'
            {
            match("alternatives"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:25:7: ( 'image' )
            // InternalVideoGen.g:25:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:26:7: ( 'toptext' )
            // InternalVideoGen.g:26:9: 'toptext'
            {
            match("toptext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:27:7: ( 'bottomtext' )
            // InternalVideoGen.g:27:9: 'bottomtext'
            {
            match("bottomtext"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:28:7: ( 'videoseq' )
            // InternalVideoGen.g:28:9: 'videoseq'
            {
            match("videoseq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:29:7: ( 'duration' )
            // InternalVideoGen.g:29:9: 'duration'
            {
            match("duration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:30:7: ( 'probability' )
            // InternalVideoGen.g:30:9: 'probability'
            {
            match("probability"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:31:7: ( 'description' )
            // InternalVideoGen.g:31:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:32:7: ( 'filter' )
            // InternalVideoGen.g:32:9: 'filter'
            {
            match("filter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:33:7: ( 'text' )
            // InternalVideoGen.g:33:9: 'text'
            {
            match("text"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:34:7: ( 'content' )
            // InternalVideoGen.g:34:9: 'content'
            {
            match("content"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:35:7: ( 'position' )
            // InternalVideoGen.g:35:9: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:36:7: ( 'color' )
            // InternalVideoGen.g:36:9: 'color'
            {
            match("color"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:37:7: ( 'size' )
            // InternalVideoGen.g:37:9: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:38:7: ( 'b&w' )
            // InternalVideoGen.g:38:9: 'b&w'
            {
            match("b&w"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:39:7: ( 'negate' )
            // InternalVideoGen.g:39:9: 'negate'
            {
            match("negate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:40:7: ( 'flip' )
            // InternalVideoGen.g:40:9: 'flip'
            {
            match("flip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_LEFT_BRACKET"
    public final void mRULE_LEFT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_LEFT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3440:19: ( '{' )
            // InternalVideoGen.g:3440:21: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_BRACKET"

    // $ANTLR start "RULE_RIGHT_BRACKET"
    public final void mRULE_RIGHT_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3442:20: ( '}' )
            // InternalVideoGen.g:3442:22: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_BRACKET"

    // $ANTLR start "RULE_PERCENTAGE"
    public final void mRULE_PERCENTAGE() throws RecognitionException {
        try {
            int _type = RULE_PERCENTAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3444:17: ( ( '1' .. '9' ( '0' .. '9' )? | '100' ) )
            // InternalVideoGen.g:3444:19: ( '1' .. '9' ( '0' .. '9' )? | '100' )
            {
            // InternalVideoGen.g:3444:19: ( '1' .. '9' ( '0' .. '9' )? | '100' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='1') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='0') ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3=='0') ) {
                        alt2=2;
                    }
                    else {
                        alt2=1;}
                }
                else {
                    alt2=1;}
            }
            else if ( ((LA2_0>='2' && LA2_0<='9')) ) {
                alt2=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVideoGen.g:3444:20: '1' .. '9' ( '0' .. '9' )?
                    {
                    matchRange('1','9'); 
                    // InternalVideoGen.g:3444:29: ( '0' .. '9' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalVideoGen.g:3444:30: '0' .. '9'
                            {
                            matchRange('0','9'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:3444:41: '100'
                    {
                    match("100"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENTAGE"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3446:12: ( RULE_INT '.' RULE_INT )
            // InternalVideoGen.g:3446:14: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3448:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalVideoGen.g:3448:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalVideoGen.g:3448:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVideoGen.g:3448:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalVideoGen.g:3448:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVideoGen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3450:10: ( ( '0' .. '9' )+ )
            // InternalVideoGen.g:3450:12: ( '0' .. '9' )+
            {
            // InternalVideoGen.g:3450:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalVideoGen.g:3450:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3452:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalVideoGen.g:3452:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalVideoGen.g:3452:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoGen.g:3452:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalVideoGen.g:3452:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalVideoGen.g:3452:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVideoGen.g:3452:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:3452:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalVideoGen.g:3452:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalVideoGen.g:3452:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVideoGen.g:3452:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3454:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalVideoGen.g:3454:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalVideoGen.g:3454:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalVideoGen.g:3454:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3456:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalVideoGen.g:3456:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalVideoGen.g:3456:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVideoGen.g:3456:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalVideoGen.g:3456:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoGen.g:3456:41: ( '\\r' )? '\\n'
                    {
                    // InternalVideoGen.g:3456:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalVideoGen.g:3456:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3458:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalVideoGen.g:3458:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalVideoGen.g:3458:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVideoGen.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalVideoGen.g:3460:16: ( . )
            // InternalVideoGen.g:3460:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalVideoGen.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_PERCENTAGE | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=41;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalVideoGen.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalVideoGen.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalVideoGen.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalVideoGen.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalVideoGen.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalVideoGen.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalVideoGen.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalVideoGen.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalVideoGen.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalVideoGen.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalVideoGen.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalVideoGen.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalVideoGen.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalVideoGen.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalVideoGen.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalVideoGen.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalVideoGen.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalVideoGen.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalVideoGen.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalVideoGen.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalVideoGen.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalVideoGen.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalVideoGen.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalVideoGen.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalVideoGen.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalVideoGen.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalVideoGen.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalVideoGen.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalVideoGen.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalVideoGen.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalVideoGen.g:1:190: RULE_LEFT_BRACKET
                {
                mRULE_LEFT_BRACKET(); 

                }
                break;
            case 32 :
                // InternalVideoGen.g:1:208: RULE_RIGHT_BRACKET
                {
                mRULE_RIGHT_BRACKET(); 

                }
                break;
            case 33 :
                // InternalVideoGen.g:1:227: RULE_PERCENTAGE
                {
                mRULE_PERCENTAGE(); 

                }
                break;
            case 34 :
                // InternalVideoGen.g:1:243: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 35 :
                // InternalVideoGen.g:1:254: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalVideoGen.g:1:262: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalVideoGen.g:1:271: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalVideoGen.g:1:283: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalVideoGen.g:1:299: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalVideoGen.g:1:315: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalVideoGen.g:1:323: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\3\41\1\45\1\50\1\41\1\37\14\41\2\uffff\2\101\1\104\1\37\1\uffff\3\37\2\uffff\1\41\1\uffff\3\41\1\uffff\2\41\1\uffff\1\41\3\uffff\7\41\1\uffff\11\41\2\uffff\1\101\1\uffff\1\101\2\uffff\1\104\4\uffff\1\143\27\41\1\101\1\uffff\13\41\1\u0086\6\41\1\u008d\2\41\1\u0090\12\41\1\u009b\1\41\1\uffff\6\41\1\uffff\1\41\1\u00a4\1\uffff\1\41\1\u00a6\1\u00a7\7\41\1\uffff\6\41\1\u00b5\1\41\1\uffff\1\u00b7\2\uffff\7\41\1\u00bf\5\41\1\uffff\1\u00c5\1\uffff\1\41\1\u00c7\1\u00c8\1\u00c9\1\41\1\u00cb\1\41\1\uffff\1\41\1\u00ce\2\41\1\u00d1\1\uffff\1\41\3\uffff\1\u00d3\1\uffff\2\41\1\uffff\2\41\1\uffff\1\u00d8\1\uffff\1\41\1\u00da\2\41\1\uffff\1\41\1\uffff\1\u00de\1\u00df\1\u00e0\3\uffff";
    static final String DFA14_eofS =
        "\u00e1\uffff";
    static final String DFA14_minS =
        "\1\0\2\117\1\105\2\60\1\151\2\141\1\160\1\154\1\155\1\145\1\46\1\145\1\157\1\151\1\157\1\151\1\145\2\uffff\3\56\1\101\1\uffff\2\0\1\52\2\uffff\1\120\1\uffff\1\124\1\116\1\162\1\uffff\1\162\1\144\1\uffff\1\144\3\uffff\1\156\2\164\1\141\1\160\1\170\1\164\1\uffff\1\162\1\163\1\157\1\163\1\154\1\151\1\154\1\172\1\147\2\uffff\1\56\1\uffff\1\56\2\uffff\1\56\4\uffff\1\60\2\124\1\151\1\164\2\145\1\144\1\151\1\145\1\147\3\164\1\141\1\143\1\142\1\151\1\164\1\160\1\164\1\157\1\145\1\141\1\56\1\uffff\1\117\1\105\1\172\1\151\2\157\1\141\1\157\1\162\2\145\1\60\1\157\1\164\1\162\1\141\1\164\1\145\1\60\1\145\1\162\1\60\1\164\1\115\1\122\1\157\1\143\1\163\1\107\1\164\2\156\1\60\1\170\1\uffff\1\155\2\151\1\142\1\151\1\162\1\uffff\1\156\1\60\1\uffff\1\145\2\60\1\156\1\141\2\145\1\157\2\141\1\uffff\2\164\1\157\1\160\1\151\1\157\1\60\1\164\1\uffff\1\60\2\uffff\1\164\1\154\1\161\1\156\1\162\1\154\1\164\1\60\1\145\1\156\1\164\1\154\1\156\1\uffff\1\60\1\uffff\1\141\3\60\1\171\1\60\1\151\1\uffff\1\170\1\60\2\151\1\60\1\uffff\1\154\3\uffff\1\60\1\uffff\1\166\1\164\1\uffff\1\157\1\164\1\uffff\1\60\1\uffff\1\145\1\60\1\156\1\171\1\uffff\1\163\1\uffff\3\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\117\1\105\2\172\1\151\1\166\1\141\1\160\1\154\1\155\2\157\1\165\1\162\1\154\1\157\1\151\1\145\2\uffff\3\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\120\1\uffff\1\124\1\116\1\162\1\uffff\1\162\1\144\1\uffff\1\144\3\uffff\1\156\2\164\1\141\1\160\1\170\1\164\1\uffff\1\162\1\163\1\157\1\163\1\154\1\151\1\156\1\172\1\147\2\uffff\1\71\1\uffff\1\71\2\uffff\1\71\4\uffff\1\172\2\124\1\151\1\164\2\145\1\144\1\151\1\145\1\147\3\164\1\141\1\143\1\142\1\151\1\164\1\160\1\164\1\157\1\145\1\141\1\71\1\uffff\1\117\1\105\1\172\1\151\2\157\1\141\1\157\1\162\2\145\1\172\1\157\1\164\1\162\1\141\1\164\1\145\1\172\1\145\1\162\1\172\1\164\1\115\1\122\1\157\1\143\1\163\1\107\1\164\2\156\1\172\1\170\1\uffff\1\155\2\151\1\142\1\151\1\162\1\uffff\1\156\1\172\1\uffff\1\145\2\172\1\156\1\141\2\145\1\157\2\141\1\uffff\2\164\1\157\1\160\1\151\1\157\1\172\1\164\1\uffff\1\172\2\uffff\1\164\1\154\1\161\1\156\1\162\1\154\1\164\1\172\1\145\1\156\1\164\1\154\1\156\1\uffff\1\172\1\uffff\1\141\3\172\1\171\1\172\1\151\1\uffff\1\170\1\172\2\151\1\172\1\uffff\1\154\3\uffff\1\172\1\uffff\1\166\1\164\1\uffff\1\157\1\164\1\uffff\1\172\1\uffff\1\145\1\172\1\156\1\171\1\uffff\1\163\1\uffff\3\172\3\uffff";
    static final String DFA14_acceptS =
        "\24\uffff\1\37\1\40\4\uffff\1\43\3\uffff\1\50\1\51\1\uffff\1\43\3\uffff\1\4\2\uffff\1\6\1\uffff\1\11\1\12\1\13\7\uffff\1\34\11\uffff\1\37\1\40\1\uffff\1\41\1\uffff\1\42\1\44\1\uffff\1\45\1\46\1\47\1\50\31\uffff\1\1\42\uffff\1\27\6\uffff\1\36\2\uffff\1\33\12\uffff\1\17\10\uffff\1\32\1\uffff\1\2\1\3\15\uffff\1\26\1\uffff\1\35\7\uffff\1\20\5\uffff\1\30\1\uffff\1\7\1\22\1\10\1\uffff\1\15\2\uffff\1\23\2\uffff\1\31\1\uffff\1\14\4\uffff\1\5\1\uffff\1\21\3\uffff\1\25\1\24\1\16";
    static final String DFA14_specialS =
        "\1\1\32\uffff\1\2\1\0\u00c4\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\7\37\1\35\1\30\1\26\10\27\6\37\1\7\1\32\1\2\1\3\20\32\1\1\1\32\1\6\4\32\3\37\1\31\1\32\1\37\1\12\1\15\1\21\1\16\1\32\1\20\1\32\1\4\1\13\3\32\1\10\1\23\1\11\1\17\2\32\1\22\1\14\1\32\1\5\4\32\1\24\1\37\1\25\uff82\37",
            "\1\40",
            "\1\42",
            "\1\43",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\16\41\1\44\13\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\4\41\1\46\3\41\1\47\21\41",
            "\1\51",
            "\1\52\1\uffff\1\54\22\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\11\uffff\1\61",
            "\1\64\110\uffff\1\63",
            "\1\66\17\uffff\1\65",
            "\1\70\2\uffff\1\67",
            "\1\71\2\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\103\1\uffff\1\100\11\102",
            "\1\103\1\uffff\12\102",
            "\1\103\1\uffff\12\105",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\0\106",
            "\0\106",
            "\1\107\4\uffff\1\110",
            "",
            "",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\1\uffff\1\136",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\103\1\uffff\1\142\11\105",
            "",
            "\1\103\1\uffff\12\105",
            "",
            "",
            "\1\103\1\uffff\12\105",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\103\1\uffff\12\105",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u008e",
            "\1\u008f",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00a5",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00b6",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00c6",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00ca",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00cf",
            "\1\u00d0",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00d2",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\u00d9",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_LEFT_BRACKET | RULE_RIGHT_BRACKET | RULE_PERCENTAGE | RULE_FLOAT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 70;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='T') ) {s = 1;}

                        else if ( (LA14_0=='B') ) {s = 2;}

                        else if ( (LA14_0=='C') ) {s = 3;}

                        else if ( (LA14_0=='h') ) {s = 4;}

                        else if ( (LA14_0=='v') ) {s = 5;}

                        else if ( (LA14_0=='V') ) {s = 6;}

                        else if ( (LA14_0=='@') ) {s = 7;}

                        else if ( (LA14_0=='m') ) {s = 8;}

                        else if ( (LA14_0=='o') ) {s = 9;}

                        else if ( (LA14_0=='a') ) {s = 10;}

                        else if ( (LA14_0=='i') ) {s = 11;}

                        else if ( (LA14_0=='t') ) {s = 12;}

                        else if ( (LA14_0=='b') ) {s = 13;}

                        else if ( (LA14_0=='d') ) {s = 14;}

                        else if ( (LA14_0=='p') ) {s = 15;}

                        else if ( (LA14_0=='f') ) {s = 16;}

                        else if ( (LA14_0=='c') ) {s = 17;}

                        else if ( (LA14_0=='s') ) {s = 18;}

                        else if ( (LA14_0=='n') ) {s = 19;}

                        else if ( (LA14_0=='{') ) {s = 20;}

                        else if ( (LA14_0=='}') ) {s = 21;}

                        else if ( (LA14_0=='1') ) {s = 22;}

                        else if ( ((LA14_0>='2' && LA14_0<='9')) ) {s = 23;}

                        else if ( (LA14_0=='0') ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( (LA14_0=='A'||(LA14_0>='D' && LA14_0<='S')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='e'||LA14_0=='g'||(LA14_0>='j' && LA14_0<='l')||(LA14_0>='q' && LA14_0<='r')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 26;}

                        else if ( (LA14_0=='\"') ) {s = 27;}

                        else if ( (LA14_0=='\'') ) {s = 28;}

                        else if ( (LA14_0=='/') ) {s = 29;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 30;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='?')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 70;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}