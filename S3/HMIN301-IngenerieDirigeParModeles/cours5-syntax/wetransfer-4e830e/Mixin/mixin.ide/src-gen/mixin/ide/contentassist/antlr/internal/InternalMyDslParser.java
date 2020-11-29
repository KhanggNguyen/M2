package mixin.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import mixin.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'A'", "'B'", "'move'", "'ml'", "'from'", "'to'", "'with'", "'filter'", "'cup'", "'cleanup'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__InstructionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__InstructionAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__InstructionAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__InstructionAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__InstructionAssignment )*
            {
             before(grammarAccess.getModelAccess().getInstructionAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__InstructionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__InstructionAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__InstructionAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getInstructionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleInstruction EOF )
            // InternalMyDsl.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Instruction__Alternatives )
            // InternalMyDsl.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:103:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMove EOF )
            // InternalMyDsl.g:105:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:112:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Move__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Move__Group__0 )
            // InternalMyDsl.g:119:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleCup"
    // InternalMyDsl.g:128:1: entryRuleCup : ruleCup EOF ;
    public final void entryRuleCup() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCup EOF )
            // InternalMyDsl.g:130:1: ruleCup EOF
            {
             before(grammarAccess.getCupRule()); 
            pushFollow(FOLLOW_1);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getCupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCup"


    // $ANTLR start "ruleCup"
    // InternalMyDsl.g:137:1: ruleCup : ( ( rule__Cup__Group__0 ) ) ;
    public final void ruleCup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Cup__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Cup__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Cup__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Cup__Group__0 )
            {
             before(grammarAccess.getCupAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Cup__Group__0 )
            // InternalMyDsl.g:144:4: rule__Cup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCup"


    // $ANTLR start "entryRuleClean"
    // InternalMyDsl.g:153:1: entryRuleClean : ruleClean EOF ;
    public final void entryRuleClean() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleClean EOF )
            // InternalMyDsl.g:155:1: ruleClean EOF
            {
             before(grammarAccess.getCleanRule()); 
            pushFollow(FOLLOW_1);
            ruleClean();

            state._fsp--;

             after(grammarAccess.getCleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClean"


    // $ANTLR start "ruleClean"
    // InternalMyDsl.g:162:1: ruleClean : ( ( rule__Clean__Group__0 ) ) ;
    public final void ruleClean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Clean__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Clean__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Clean__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Clean__Group__0 )
            {
             before(grammarAccess.getCleanAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Clean__Group__0 )
            // InternalMyDsl.g:169:4: rule__Clean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCleanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClean"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalMyDsl.g:177:1: rule__Instruction__Alternatives : ( ( ruleMove ) | ( ruleClean ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( ruleMove ) | ( ruleClean ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:182:2: ( ruleMove )
                    {
                    // InternalMyDsl.g:182:2: ( ruleMove )
                    // InternalMyDsl.g:183:3: ruleMove
                    {
                     before(grammarAccess.getInstructionAccess().getMoveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMoveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( ruleClean )
                    {
                    // InternalMyDsl.g:188:2: ( ruleClean )
                    // InternalMyDsl.g:189:3: ruleClean
                    {
                     before(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClean();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__Move__FilterAlternatives_7_2_0"
    // InternalMyDsl.g:198:1: rule__Move__FilterAlternatives_7_2_0 : ( ( 'A' ) | ( 'B' ) );
    public final void rule__Move__FilterAlternatives_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( ( 'A' ) | ( 'B' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:203:2: ( 'A' )
                    {
                    // InternalMyDsl.g:203:2: ( 'A' )
                    // InternalMyDsl.g:204:3: 'A'
                    {
                     before(grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:209:2: ( 'B' )
                    {
                    // InternalMyDsl.g:209:2: ( 'B' )
                    // InternalMyDsl.g:210:3: 'B'
                    {
                     before(grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__FilterAlternatives_7_2_0"


    // $ANTLR start "rule__Move__Group__0"
    // InternalMyDsl.g:219:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalMyDsl.g:224:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalMyDsl.g:231:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:235:1: ( ( 'move' ) )
            // InternalMyDsl.g:236:1: ( 'move' )
            {
            // InternalMyDsl.g:236:1: ( 'move' )
            // InternalMyDsl.g:237:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalMyDsl.g:246:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:250:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalMyDsl.g:251:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalMyDsl.g:258:1: rule__Move__Group__1__Impl : ( ( rule__Move__QtyAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:262:1: ( ( ( rule__Move__QtyAssignment_1 ) ) )
            // InternalMyDsl.g:263:1: ( ( rule__Move__QtyAssignment_1 ) )
            {
            // InternalMyDsl.g:263:1: ( ( rule__Move__QtyAssignment_1 ) )
            // InternalMyDsl.g:264:2: ( rule__Move__QtyAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getQtyAssignment_1()); 
            // InternalMyDsl.g:265:2: ( rule__Move__QtyAssignment_1 )
            // InternalMyDsl.g:265:3: rule__Move__QtyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__QtyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getQtyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalMyDsl.g:273:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:277:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalMyDsl.g:278:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Move__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalMyDsl.g:285:1: rule__Move__Group__2__Impl : ( 'ml' ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:289:1: ( ( 'ml' ) )
            // InternalMyDsl.g:290:1: ( 'ml' )
            {
            // InternalMyDsl.g:290:1: ( 'ml' )
            // InternalMyDsl.g:291:2: 'ml'
            {
             before(grammarAccess.getMoveAccess().getMlKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMlKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__3"
    // InternalMyDsl.g:300:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:304:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalMyDsl.g:305:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Move__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3"


    // $ANTLR start "rule__Move__Group__3__Impl"
    // InternalMyDsl.g:312:1: rule__Move__Group__3__Impl : ( 'from' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:1: ( ( 'from' ) )
            // InternalMyDsl.g:317:1: ( 'from' )
            {
            // InternalMyDsl.g:317:1: ( 'from' )
            // InternalMyDsl.g:318:2: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__3__Impl"


    // $ANTLR start "rule__Move__Group__4"
    // InternalMyDsl.g:327:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // InternalMyDsl.g:332:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Move__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4"


    // $ANTLR start "rule__Move__Group__4__Impl"
    // InternalMyDsl.g:339:1: rule__Move__Group__4__Impl : ( ( rule__Move__FromAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:343:1: ( ( ( rule__Move__FromAssignment_4 ) ) )
            // InternalMyDsl.g:344:1: ( ( rule__Move__FromAssignment_4 ) )
            {
            // InternalMyDsl.g:344:1: ( ( rule__Move__FromAssignment_4 ) )
            // InternalMyDsl.g:345:2: ( rule__Move__FromAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_4()); 
            // InternalMyDsl.g:346:2: ( rule__Move__FromAssignment_4 )
            // InternalMyDsl.g:346:3: rule__Move__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Move__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getFromAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__4__Impl"


    // $ANTLR start "rule__Move__Group__5"
    // InternalMyDsl.g:354:1: rule__Move__Group__5 : rule__Move__Group__5__Impl rule__Move__Group__6 ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( rule__Move__Group__5__Impl rule__Move__Group__6 )
            // InternalMyDsl.g:359:2: rule__Move__Group__5__Impl rule__Move__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Move__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5"


    // $ANTLR start "rule__Move__Group__5__Impl"
    // InternalMyDsl.g:366:1: rule__Move__Group__5__Impl : ( 'to' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:370:1: ( ( 'to' ) )
            // InternalMyDsl.g:371:1: ( 'to' )
            {
            // InternalMyDsl.g:371:1: ( 'to' )
            // InternalMyDsl.g:372:2: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__5__Impl"


    // $ANTLR start "rule__Move__Group__6"
    // InternalMyDsl.g:381:1: rule__Move__Group__6 : rule__Move__Group__6__Impl rule__Move__Group__7 ;
    public final void rule__Move__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:385:1: ( rule__Move__Group__6__Impl rule__Move__Group__7 )
            // InternalMyDsl.g:386:2: rule__Move__Group__6__Impl rule__Move__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Move__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__6"


    // $ANTLR start "rule__Move__Group__6__Impl"
    // InternalMyDsl.g:393:1: rule__Move__Group__6__Impl : ( ( rule__Move__ToAssignment_6 ) ) ;
    public final void rule__Move__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:397:1: ( ( ( rule__Move__ToAssignment_6 ) ) )
            // InternalMyDsl.g:398:1: ( ( rule__Move__ToAssignment_6 ) )
            {
            // InternalMyDsl.g:398:1: ( ( rule__Move__ToAssignment_6 ) )
            // InternalMyDsl.g:399:2: ( rule__Move__ToAssignment_6 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_6()); 
            // InternalMyDsl.g:400:2: ( rule__Move__ToAssignment_6 )
            // InternalMyDsl.g:400:3: rule__Move__ToAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Move__ToAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getToAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__6__Impl"


    // $ANTLR start "rule__Move__Group__7"
    // InternalMyDsl.g:408:1: rule__Move__Group__7 : rule__Move__Group__7__Impl ;
    public final void rule__Move__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:412:1: ( rule__Move__Group__7__Impl )
            // InternalMyDsl.g:413:2: rule__Move__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__7"


    // $ANTLR start "rule__Move__Group__7__Impl"
    // InternalMyDsl.g:419:1: rule__Move__Group__7__Impl : ( ( rule__Move__Group_7__0 )? ) ;
    public final void rule__Move__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__Move__Group_7__0 )? ) )
            // InternalMyDsl.g:424:1: ( ( rule__Move__Group_7__0 )? )
            {
            // InternalMyDsl.g:424:1: ( ( rule__Move__Group_7__0 )? )
            // InternalMyDsl.g:425:2: ( rule__Move__Group_7__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_7()); 
            // InternalMyDsl.g:426:2: ( rule__Move__Group_7__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:426:3: rule__Move__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__7__Impl"


    // $ANTLR start "rule__Move__Group_7__0"
    // InternalMyDsl.g:435:1: rule__Move__Group_7__0 : rule__Move__Group_7__0__Impl rule__Move__Group_7__1 ;
    public final void rule__Move__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( rule__Move__Group_7__0__Impl rule__Move__Group_7__1 )
            // InternalMyDsl.g:440:2: rule__Move__Group_7__0__Impl rule__Move__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Move__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_7__0"


    // $ANTLR start "rule__Move__Group_7__0__Impl"
    // InternalMyDsl.g:447:1: rule__Move__Group_7__0__Impl : ( 'with' ) ;
    public final void rule__Move__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:451:1: ( ( 'with' ) )
            // InternalMyDsl.g:452:1: ( 'with' )
            {
            // InternalMyDsl.g:452:1: ( 'with' )
            // InternalMyDsl.g:453:2: 'with'
            {
             before(grammarAccess.getMoveAccess().getWithKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getWithKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_7__0__Impl"


    // $ANTLR start "rule__Move__Group_7__1"
    // InternalMyDsl.g:462:1: rule__Move__Group_7__1 : rule__Move__Group_7__1__Impl rule__Move__Group_7__2 ;
    public final void rule__Move__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:1: ( rule__Move__Group_7__1__Impl rule__Move__Group_7__2 )
            // InternalMyDsl.g:467:2: rule__Move__Group_7__1__Impl rule__Move__Group_7__2
            {
            pushFollow(FOLLOW_11);
            rule__Move__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_7__1"


    // $ANTLR start "rule__Move__Group_7__1__Impl"
    // InternalMyDsl.g:474:1: rule__Move__Group_7__1__Impl : ( 'filter' ) ;
    public final void rule__Move__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( 'filter' ) )
            // InternalMyDsl.g:479:1: ( 'filter' )
            {
            // InternalMyDsl.g:479:1: ( 'filter' )
            // InternalMyDsl.g:480:2: 'filter'
            {
             before(grammarAccess.getMoveAccess().getFilterKeyword_7_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getFilterKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_7__1__Impl"


    // $ANTLR start "rule__Move__Group_7__2"
    // InternalMyDsl.g:489:1: rule__Move__Group_7__2 : rule__Move__Group_7__2__Impl ;
    public final void rule__Move__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:493:1: ( rule__Move__Group_7__2__Impl )
            // InternalMyDsl.g:494:2: rule__Move__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_7__2"


    // $ANTLR start "rule__Move__Group_7__2__Impl"
    // InternalMyDsl.g:500:1: rule__Move__Group_7__2__Impl : ( ( rule__Move__FilterAssignment_7_2 ) ) ;
    public final void rule__Move__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( ( ( rule__Move__FilterAssignment_7_2 ) ) )
            // InternalMyDsl.g:505:1: ( ( rule__Move__FilterAssignment_7_2 ) )
            {
            // InternalMyDsl.g:505:1: ( ( rule__Move__FilterAssignment_7_2 ) )
            // InternalMyDsl.g:506:2: ( rule__Move__FilterAssignment_7_2 )
            {
             before(grammarAccess.getMoveAccess().getFilterAssignment_7_2()); 
            // InternalMyDsl.g:507:2: ( rule__Move__FilterAssignment_7_2 )
            // InternalMyDsl.g:507:3: rule__Move__FilterAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__FilterAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getFilterAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group_7__2__Impl"


    // $ANTLR start "rule__Cup__Group__0"
    // InternalMyDsl.g:516:1: rule__Cup__Group__0 : rule__Cup__Group__0__Impl rule__Cup__Group__1 ;
    public final void rule__Cup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:520:1: ( rule__Cup__Group__0__Impl rule__Cup__Group__1 )
            // InternalMyDsl.g:521:2: rule__Cup__Group__0__Impl rule__Cup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cup__Group__0"


    // $ANTLR start "rule__Cup__Group__0__Impl"
    // InternalMyDsl.g:528:1: rule__Cup__Group__0__Impl : ( 'cup' ) ;
    public final void rule__Cup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( 'cup' ) )
            // InternalMyDsl.g:533:1: ( 'cup' )
            {
            // InternalMyDsl.g:533:1: ( 'cup' )
            // InternalMyDsl.g:534:2: 'cup'
            {
             before(grammarAccess.getCupAccess().getCupKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCupAccess().getCupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cup__Group__0__Impl"


    // $ANTLR start "rule__Cup__Group__1"
    // InternalMyDsl.g:543:1: rule__Cup__Group__1 : rule__Cup__Group__1__Impl ;
    public final void rule__Cup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:547:1: ( rule__Cup__Group__1__Impl )
            // InternalMyDsl.g:548:2: rule__Cup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cup__Group__1"


    // $ANTLR start "rule__Cup__Group__1__Impl"
    // InternalMyDsl.g:554:1: rule__Cup__Group__1__Impl : ( ( rule__Cup__NrAssignment_1 ) ) ;
    public final void rule__Cup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( ( ( rule__Cup__NrAssignment_1 ) ) )
            // InternalMyDsl.g:559:1: ( ( rule__Cup__NrAssignment_1 ) )
            {
            // InternalMyDsl.g:559:1: ( ( rule__Cup__NrAssignment_1 ) )
            // InternalMyDsl.g:560:2: ( rule__Cup__NrAssignment_1 )
            {
             before(grammarAccess.getCupAccess().getNrAssignment_1()); 
            // InternalMyDsl.g:561:2: ( rule__Cup__NrAssignment_1 )
            // InternalMyDsl.g:561:3: rule__Cup__NrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cup__NrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCupAccess().getNrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cup__Group__1__Impl"


    // $ANTLR start "rule__Clean__Group__0"
    // InternalMyDsl.g:570:1: rule__Clean__Group__0 : rule__Clean__Group__0__Impl rule__Clean__Group__1 ;
    public final void rule__Clean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:574:1: ( rule__Clean__Group__0__Impl rule__Clean__Group__1 )
            // InternalMyDsl.g:575:2: rule__Clean__Group__0__Impl rule__Clean__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Clean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clean__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clean__Group__0"


    // $ANTLR start "rule__Clean__Group__0__Impl"
    // InternalMyDsl.g:582:1: rule__Clean__Group__0__Impl : ( () ) ;
    public final void rule__Clean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:586:1: ( ( () ) )
            // InternalMyDsl.g:587:1: ( () )
            {
            // InternalMyDsl.g:587:1: ( () )
            // InternalMyDsl.g:588:2: ()
            {
             before(grammarAccess.getCleanAccess().getCleanAction_0()); 
            // InternalMyDsl.g:589:2: ()
            // InternalMyDsl.g:589:3: 
            {
            }

             after(grammarAccess.getCleanAccess().getCleanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clean__Group__0__Impl"


    // $ANTLR start "rule__Clean__Group__1"
    // InternalMyDsl.g:597:1: rule__Clean__Group__1 : rule__Clean__Group__1__Impl ;
    public final void rule__Clean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:601:1: ( rule__Clean__Group__1__Impl )
            // InternalMyDsl.g:602:2: rule__Clean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clean__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clean__Group__1"


    // $ANTLR start "rule__Clean__Group__1__Impl"
    // InternalMyDsl.g:608:1: rule__Clean__Group__1__Impl : ( 'cleanup' ) ;
    public final void rule__Clean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( ( 'cleanup' ) )
            // InternalMyDsl.g:613:1: ( 'cleanup' )
            {
            // InternalMyDsl.g:613:1: ( 'cleanup' )
            // InternalMyDsl.g:614:2: 'cleanup'
            {
             before(grammarAccess.getCleanAccess().getCleanupKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCleanAccess().getCleanupKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clean__Group__1__Impl"


    // $ANTLR start "rule__Model__InstructionAssignment"
    // InternalMyDsl.g:624:1: rule__Model__InstructionAssignment : ( ruleInstruction ) ;
    public final void rule__Model__InstructionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:629:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:629:2: ( ruleInstruction )
            // InternalMyDsl.g:630:3: ruleInstruction
            {
             before(grammarAccess.getModelAccess().getInstructionInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getInstructionInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__InstructionAssignment"


    // $ANTLR start "rule__Move__QtyAssignment_1"
    // InternalMyDsl.g:639:1: rule__Move__QtyAssignment_1 : ( RULE_INT ) ;
    public final void rule__Move__QtyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:644:2: ( RULE_INT )
            {
            // InternalMyDsl.g:644:2: ( RULE_INT )
            // InternalMyDsl.g:645:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__QtyAssignment_1"


    // $ANTLR start "rule__Move__FromAssignment_4"
    // InternalMyDsl.g:654:1: rule__Move__FromAssignment_4 : ( ruleCup ) ;
    public final void rule__Move__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( ( ruleCup ) )
            // InternalMyDsl.g:659:2: ( ruleCup )
            {
            // InternalMyDsl.g:659:2: ( ruleCup )
            // InternalMyDsl.g:660:3: ruleCup
            {
             before(grammarAccess.getMoveAccess().getFromCupParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getFromCupParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__FromAssignment_4"


    // $ANTLR start "rule__Move__ToAssignment_6"
    // InternalMyDsl.g:669:1: rule__Move__ToAssignment_6 : ( ruleCup ) ;
    public final void rule__Move__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( ruleCup ) )
            // InternalMyDsl.g:674:2: ( ruleCup )
            {
            // InternalMyDsl.g:674:2: ( ruleCup )
            // InternalMyDsl.g:675:3: ruleCup
            {
             before(grammarAccess.getMoveAccess().getToCupParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getToCupParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__ToAssignment_6"


    // $ANTLR start "rule__Move__FilterAssignment_7_2"
    // InternalMyDsl.g:684:1: rule__Move__FilterAssignment_7_2 : ( ( rule__Move__FilterAlternatives_7_2_0 ) ) ;
    public final void rule__Move__FilterAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( ( ( rule__Move__FilterAlternatives_7_2_0 ) ) )
            // InternalMyDsl.g:689:2: ( ( rule__Move__FilterAlternatives_7_2_0 ) )
            {
            // InternalMyDsl.g:689:2: ( ( rule__Move__FilterAlternatives_7_2_0 ) )
            // InternalMyDsl.g:690:3: ( rule__Move__FilterAlternatives_7_2_0 )
            {
             before(grammarAccess.getMoveAccess().getFilterAlternatives_7_2_0()); 
            // InternalMyDsl.g:691:3: ( rule__Move__FilterAlternatives_7_2_0 )
            // InternalMyDsl.g:691:4: rule__Move__FilterAlternatives_7_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__FilterAlternatives_7_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getFilterAlternatives_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__FilterAssignment_7_2"


    // $ANTLR start "rule__Cup__NrAssignment_1"
    // InternalMyDsl.g:699:1: rule__Cup__NrAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cup__NrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:704:2: ( RULE_INT )
            {
            // InternalMyDsl.g:704:2: ( RULE_INT )
            // InternalMyDsl.g:705:3: RULE_INT
            {
             before(grammarAccess.getCupAccess().getNrINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCupAccess().getNrINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cup__NrAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000102000L});

}