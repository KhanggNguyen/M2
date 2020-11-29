package org.example.melangeurmodel.ide.contentassist.antlr.internal;

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
import org.example.melangeurmodel.services.MelangeurmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMelangeurmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'less'", "'more'", "'equal'", "'diff'", "'A'", "'B'", "'from'", "'to'", "'scan'", "'if'", "'ml'", "'with'", "'filter'", "'wait'", "'before'", "'clean'", "'datatype'", "'variable'", "'cup'", "'cleanup'", "'move'"
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMelangeurmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMelangeurmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMelangeurmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMelangeurmodel.g"; }


    	private MelangeurmodelGrammarAccess grammarAccess;

    	public void setGrammarAccess(MelangeurmodelGrammarAccess grammarAccess) {
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
    // InternalMelangeurmodel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:54:1: ( ruleModel EOF )
            // InternalMelangeurmodel.g:55:1: ruleModel EOF
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
    // InternalMelangeurmodel.g:62:1: ruleModel : ( ( rule__Model__InstructionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:66:2: ( ( ( rule__Model__InstructionAssignment )* ) )
            // InternalMelangeurmodel.g:67:2: ( ( rule__Model__InstructionAssignment )* )
            {
            // InternalMelangeurmodel.g:67:2: ( ( rule__Model__InstructionAssignment )* )
            // InternalMelangeurmodel.g:68:3: ( rule__Model__InstructionAssignment )*
            {
             before(grammarAccess.getModelAccess().getInstructionAssignment()); 
            // InternalMelangeurmodel.g:69:3: ( rule__Model__InstructionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27||(LA1_0>=30 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMelangeurmodel.g:69:4: rule__Model__InstructionAssignment
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
    // InternalMelangeurmodel.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:79:1: ( ruleInstruction EOF )
            // InternalMelangeurmodel.g:80:1: ruleInstruction EOF
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
    // InternalMelangeurmodel.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalMelangeurmodel.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalMelangeurmodel.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalMelangeurmodel.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalMelangeurmodel.g:94:3: ( rule__Instruction__Alternatives )
            // InternalMelangeurmodel.g:94:4: rule__Instruction__Alternatives
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
    // InternalMelangeurmodel.g:103:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:104:1: ( ruleMove EOF )
            // InternalMelangeurmodel.g:105:1: ruleMove EOF
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
    // InternalMelangeurmodel.g:112:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:116:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalMelangeurmodel.g:117:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalMelangeurmodel.g:117:2: ( ( rule__Move__Group__0 ) )
            // InternalMelangeurmodel.g:118:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalMelangeurmodel.g:119:3: ( rule__Move__Group__0 )
            // InternalMelangeurmodel.g:119:4: rule__Move__Group__0
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


    // $ANTLR start "entryRuleDatatype"
    // InternalMelangeurmodel.g:128:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:129:1: ( ruleDatatype EOF )
            // InternalMelangeurmodel.g:130:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalMelangeurmodel.g:137:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:141:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // InternalMelangeurmodel.g:142:2: ( ( rule__Datatype__Group__0 ) )
            {
            // InternalMelangeurmodel.g:142:2: ( ( rule__Datatype__Group__0 ) )
            // InternalMelangeurmodel.g:143:3: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // InternalMelangeurmodel.g:144:3: ( rule__Datatype__Group__0 )
            // InternalMelangeurmodel.g:144:4: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleVariable"
    // InternalMelangeurmodel.g:153:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:154:1: ( ruleVariable EOF )
            // InternalMelangeurmodel.g:155:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMelangeurmodel.g:162:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:166:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMelangeurmodel.g:167:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMelangeurmodel.g:167:2: ( ( rule__Variable__Group__0 ) )
            // InternalMelangeurmodel.g:168:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMelangeurmodel.g:169:3: ( rule__Variable__Group__0 )
            // InternalMelangeurmodel.g:169:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCup"
    // InternalMelangeurmodel.g:178:1: entryRuleCup : ruleCup EOF ;
    public final void entryRuleCup() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:179:1: ( ruleCup EOF )
            // InternalMelangeurmodel.g:180:1: ruleCup EOF
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
    // InternalMelangeurmodel.g:187:1: ruleCup : ( ( rule__Cup__Group__0 ) ) ;
    public final void ruleCup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:191:2: ( ( ( rule__Cup__Group__0 ) ) )
            // InternalMelangeurmodel.g:192:2: ( ( rule__Cup__Group__0 ) )
            {
            // InternalMelangeurmodel.g:192:2: ( ( rule__Cup__Group__0 ) )
            // InternalMelangeurmodel.g:193:3: ( rule__Cup__Group__0 )
            {
             before(grammarAccess.getCupAccess().getGroup()); 
            // InternalMelangeurmodel.g:194:3: ( rule__Cup__Group__0 )
            // InternalMelangeurmodel.g:194:4: rule__Cup__Group__0
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
    // InternalMelangeurmodel.g:203:1: entryRuleClean : ruleClean EOF ;
    public final void entryRuleClean() throws RecognitionException {
        try {
            // InternalMelangeurmodel.g:204:1: ( ruleClean EOF )
            // InternalMelangeurmodel.g:205:1: ruleClean EOF
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
    // InternalMelangeurmodel.g:212:1: ruleClean : ( ( rule__Clean__Group__0 ) ) ;
    public final void ruleClean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:216:2: ( ( ( rule__Clean__Group__0 ) ) )
            // InternalMelangeurmodel.g:217:2: ( ( rule__Clean__Group__0 ) )
            {
            // InternalMelangeurmodel.g:217:2: ( ( rule__Clean__Group__0 ) )
            // InternalMelangeurmodel.g:218:3: ( rule__Clean__Group__0 )
            {
             before(grammarAccess.getCleanAccess().getGroup()); 
            // InternalMelangeurmodel.g:219:3: ( rule__Clean__Group__0 )
            // InternalMelangeurmodel.g:219:4: rule__Clean__Group__0
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
    // InternalMelangeurmodel.g:227:1: rule__Instruction__Alternatives : ( ( ruleMove ) | ( ruleClean ) | ( ruleDatatype ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:231:1: ( ( ruleMove ) | ( ruleClean ) | ( ruleDatatype ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMelangeurmodel.g:232:2: ( ruleMove )
                    {
                    // InternalMelangeurmodel.g:232:2: ( ruleMove )
                    // InternalMelangeurmodel.g:233:3: ruleMove
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
                    // InternalMelangeurmodel.g:238:2: ( ruleClean )
                    {
                    // InternalMelangeurmodel.g:238:2: ( ruleClean )
                    // InternalMelangeurmodel.g:239:3: ruleClean
                    {
                     before(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClean();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMelangeurmodel.g:244:2: ( ruleDatatype )
                    {
                    // InternalMelangeurmodel.g:244:2: ( ruleDatatype )
                    // InternalMelangeurmodel.g:245:3: ruleDatatype
                    {
                     before(grammarAccess.getInstructionAccess().getDatatypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDatatype();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDatatypeParserRuleCall_2()); 

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


    // $ANTLR start "rule__Move__TypeAlternatives_1_2_0"
    // InternalMelangeurmodel.g:254:1: rule__Move__TypeAlternatives_1_2_0 : ( ( 'less' ) | ( 'more' ) | ( 'equal' ) | ( 'diff' ) );
    public final void rule__Move__TypeAlternatives_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:258:1: ( ( 'less' ) | ( 'more' ) | ( 'equal' ) | ( 'diff' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMelangeurmodel.g:259:2: ( 'less' )
                    {
                    // InternalMelangeurmodel.g:259:2: ( 'less' )
                    // InternalMelangeurmodel.g:260:3: 'less'
                    {
                     before(grammarAccess.getMoveAccess().getTypeLessKeyword_1_2_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeLessKeyword_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMelangeurmodel.g:265:2: ( 'more' )
                    {
                    // InternalMelangeurmodel.g:265:2: ( 'more' )
                    // InternalMelangeurmodel.g:266:3: 'more'
                    {
                     before(grammarAccess.getMoveAccess().getTypeMoreKeyword_1_2_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeMoreKeyword_1_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMelangeurmodel.g:271:2: ( 'equal' )
                    {
                    // InternalMelangeurmodel.g:271:2: ( 'equal' )
                    // InternalMelangeurmodel.g:272:3: 'equal'
                    {
                     before(grammarAccess.getMoveAccess().getTypeEqualKeyword_1_2_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeEqualKeyword_1_2_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMelangeurmodel.g:277:2: ( 'diff' )
                    {
                    // InternalMelangeurmodel.g:277:2: ( 'diff' )
                    // InternalMelangeurmodel.g:278:3: 'diff'
                    {
                     before(grammarAccess.getMoveAccess().getTypeDiffKeyword_1_2_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getTypeDiffKeyword_1_2_0_3()); 

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
    // $ANTLR end "rule__Move__TypeAlternatives_1_2_0"


    // $ANTLR start "rule__Move__FilterAlternatives_7_2_0"
    // InternalMelangeurmodel.g:287:1: rule__Move__FilterAlternatives_7_2_0 : ( ( 'A' ) | ( 'B' ) );
    public final void rule__Move__FilterAlternatives_7_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:291:1: ( ( 'A' ) | ( 'B' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMelangeurmodel.g:292:2: ( 'A' )
                    {
                    // InternalMelangeurmodel.g:292:2: ( 'A' )
                    // InternalMelangeurmodel.g:293:3: 'A'
                    {
                     before(grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMelangeurmodel.g:298:2: ( 'B' )
                    {
                    // InternalMelangeurmodel.g:298:2: ( 'B' )
                    // InternalMelangeurmodel.g:299:3: 'B'
                    {
                     before(grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1()); 
                    match(input,16,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:308:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:312:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalMelangeurmodel.g:313:2: rule__Move__Group__0__Impl rule__Move__Group__1
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
    // InternalMelangeurmodel.g:320:1: rule__Move__Group__0__Impl : ( ( rule__Move__MoveAssignment_0 ) ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:324:1: ( ( ( rule__Move__MoveAssignment_0 ) ) )
            // InternalMelangeurmodel.g:325:1: ( ( rule__Move__MoveAssignment_0 ) )
            {
            // InternalMelangeurmodel.g:325:1: ( ( rule__Move__MoveAssignment_0 ) )
            // InternalMelangeurmodel.g:326:2: ( rule__Move__MoveAssignment_0 )
            {
             before(grammarAccess.getMoveAccess().getMoveAssignment_0()); 
            // InternalMelangeurmodel.g:327:2: ( rule__Move__MoveAssignment_0 )
            // InternalMelangeurmodel.g:327:3: rule__Move__MoveAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__MoveAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getMoveAssignment_0()); 

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
    // InternalMelangeurmodel.g:335:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:339:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalMelangeurmodel.g:340:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalMelangeurmodel.g:347:1: rule__Move__Group__1__Impl : ( ( rule__Move__Group_1__0 )? ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:351:1: ( ( ( rule__Move__Group_1__0 )? ) )
            // InternalMelangeurmodel.g:352:1: ( ( rule__Move__Group_1__0 )? )
            {
            // InternalMelangeurmodel.g:352:1: ( ( rule__Move__Group_1__0 )? )
            // InternalMelangeurmodel.g:353:2: ( rule__Move__Group_1__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_1()); 
            // InternalMelangeurmodel.g:354:2: ( rule__Move__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMelangeurmodel.g:354:3: rule__Move__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_1()); 

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
    // InternalMelangeurmodel.g:362:1: rule__Move__Group__2 : rule__Move__Group__2__Impl rule__Move__Group__3 ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:366:1: ( rule__Move__Group__2__Impl rule__Move__Group__3 )
            // InternalMelangeurmodel.g:367:2: rule__Move__Group__2__Impl rule__Move__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalMelangeurmodel.g:374:1: rule__Move__Group__2__Impl : ( ( rule__Move__Group_2__0 )? ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:378:1: ( ( ( rule__Move__Group_2__0 )? ) )
            // InternalMelangeurmodel.g:379:1: ( ( rule__Move__Group_2__0 )? )
            {
            // InternalMelangeurmodel.g:379:1: ( ( rule__Move__Group_2__0 )? )
            // InternalMelangeurmodel.g:380:2: ( rule__Move__Group_2__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_2()); 
            // InternalMelangeurmodel.g:381:2: ( rule__Move__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMelangeurmodel.g:381:3: rule__Move__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_2()); 

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
    // InternalMelangeurmodel.g:389:1: rule__Move__Group__3 : rule__Move__Group__3__Impl rule__Move__Group__4 ;
    public final void rule__Move__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:393:1: ( rule__Move__Group__3__Impl rule__Move__Group__4 )
            // InternalMelangeurmodel.g:394:2: rule__Move__Group__3__Impl rule__Move__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalMelangeurmodel.g:401:1: rule__Move__Group__3__Impl : ( 'from' ) ;
    public final void rule__Move__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:405:1: ( ( 'from' ) )
            // InternalMelangeurmodel.g:406:1: ( 'from' )
            {
            // InternalMelangeurmodel.g:406:1: ( 'from' )
            // InternalMelangeurmodel.g:407:2: 'from'
            {
             before(grammarAccess.getMoveAccess().getFromKeyword_3()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:416:1: rule__Move__Group__4 : rule__Move__Group__4__Impl rule__Move__Group__5 ;
    public final void rule__Move__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:420:1: ( rule__Move__Group__4__Impl rule__Move__Group__5 )
            // InternalMelangeurmodel.g:421:2: rule__Move__Group__4__Impl rule__Move__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMelangeurmodel.g:428:1: rule__Move__Group__4__Impl : ( ( rule__Move__FromAssignment_4 ) ) ;
    public final void rule__Move__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:432:1: ( ( ( rule__Move__FromAssignment_4 ) ) )
            // InternalMelangeurmodel.g:433:1: ( ( rule__Move__FromAssignment_4 ) )
            {
            // InternalMelangeurmodel.g:433:1: ( ( rule__Move__FromAssignment_4 ) )
            // InternalMelangeurmodel.g:434:2: ( rule__Move__FromAssignment_4 )
            {
             before(grammarAccess.getMoveAccess().getFromAssignment_4()); 
            // InternalMelangeurmodel.g:435:2: ( rule__Move__FromAssignment_4 )
            // InternalMelangeurmodel.g:435:3: rule__Move__FromAssignment_4
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
    // InternalMelangeurmodel.g:443:1: rule__Move__Group__5 : rule__Move__Group__5__Impl rule__Move__Group__6 ;
    public final void rule__Move__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:447:1: ( rule__Move__Group__5__Impl rule__Move__Group__6 )
            // InternalMelangeurmodel.g:448:2: rule__Move__Group__5__Impl rule__Move__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalMelangeurmodel.g:455:1: rule__Move__Group__5__Impl : ( 'to' ) ;
    public final void rule__Move__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:459:1: ( ( 'to' ) )
            // InternalMelangeurmodel.g:460:1: ( 'to' )
            {
            // InternalMelangeurmodel.g:460:1: ( 'to' )
            // InternalMelangeurmodel.g:461:2: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:470:1: rule__Move__Group__6 : rule__Move__Group__6__Impl rule__Move__Group__7 ;
    public final void rule__Move__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:474:1: ( rule__Move__Group__6__Impl rule__Move__Group__7 )
            // InternalMelangeurmodel.g:475:2: rule__Move__Group__6__Impl rule__Move__Group__7
            {
            pushFollow(FOLLOW_7);
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
    // InternalMelangeurmodel.g:482:1: rule__Move__Group__6__Impl : ( ( rule__Move__ToAssignment_6 ) ) ;
    public final void rule__Move__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:486:1: ( ( ( rule__Move__ToAssignment_6 ) ) )
            // InternalMelangeurmodel.g:487:1: ( ( rule__Move__ToAssignment_6 ) )
            {
            // InternalMelangeurmodel.g:487:1: ( ( rule__Move__ToAssignment_6 ) )
            // InternalMelangeurmodel.g:488:2: ( rule__Move__ToAssignment_6 )
            {
             before(grammarAccess.getMoveAccess().getToAssignment_6()); 
            // InternalMelangeurmodel.g:489:2: ( rule__Move__ToAssignment_6 )
            // InternalMelangeurmodel.g:489:3: rule__Move__ToAssignment_6
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
    // InternalMelangeurmodel.g:497:1: rule__Move__Group__7 : rule__Move__Group__7__Impl rule__Move__Group__8 ;
    public final void rule__Move__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:501:1: ( rule__Move__Group__7__Impl rule__Move__Group__8 )
            // InternalMelangeurmodel.g:502:2: rule__Move__Group__7__Impl rule__Move__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Move__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__8();

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
    // InternalMelangeurmodel.g:509:1: rule__Move__Group__7__Impl : ( ( rule__Move__Group_7__0 )? ) ;
    public final void rule__Move__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:513:1: ( ( ( rule__Move__Group_7__0 )? ) )
            // InternalMelangeurmodel.g:514:1: ( ( rule__Move__Group_7__0 )? )
            {
            // InternalMelangeurmodel.g:514:1: ( ( rule__Move__Group_7__0 )? )
            // InternalMelangeurmodel.g:515:2: ( rule__Move__Group_7__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_7()); 
            // InternalMelangeurmodel.g:516:2: ( rule__Move__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMelangeurmodel.g:516:3: rule__Move__Group_7__0
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


    // $ANTLR start "rule__Move__Group__8"
    // InternalMelangeurmodel.g:524:1: rule__Move__Group__8 : rule__Move__Group__8__Impl ;
    public final void rule__Move__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:528:1: ( rule__Move__Group__8__Impl )
            // InternalMelangeurmodel.g:529:2: rule__Move__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__8__Impl();

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
    // $ANTLR end "rule__Move__Group__8"


    // $ANTLR start "rule__Move__Group__8__Impl"
    // InternalMelangeurmodel.g:535:1: rule__Move__Group__8__Impl : ( ( rule__Move__Group_8__0 )? ) ;
    public final void rule__Move__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:539:1: ( ( ( rule__Move__Group_8__0 )? ) )
            // InternalMelangeurmodel.g:540:1: ( ( rule__Move__Group_8__0 )? )
            {
            // InternalMelangeurmodel.g:540:1: ( ( rule__Move__Group_8__0 )? )
            // InternalMelangeurmodel.g:541:2: ( rule__Move__Group_8__0 )?
            {
             before(grammarAccess.getMoveAccess().getGroup_8()); 
            // InternalMelangeurmodel.g:542:2: ( rule__Move__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMelangeurmodel.g:542:3: rule__Move__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Move__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Move__Group__8__Impl"


    // $ANTLR start "rule__Move__Group_1__0"
    // InternalMelangeurmodel.g:551:1: rule__Move__Group_1__0 : rule__Move__Group_1__0__Impl rule__Move__Group_1__1 ;
    public final void rule__Move__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:555:1: ( rule__Move__Group_1__0__Impl rule__Move__Group_1__1 )
            // InternalMelangeurmodel.g:556:2: rule__Move__Group_1__0__Impl rule__Move__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Move__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_1__1();

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
    // $ANTLR end "rule__Move__Group_1__0"


    // $ANTLR start "rule__Move__Group_1__0__Impl"
    // InternalMelangeurmodel.g:563:1: rule__Move__Group_1__0__Impl : ( 'scan' ) ;
    public final void rule__Move__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:567:1: ( ( 'scan' ) )
            // InternalMelangeurmodel.g:568:1: ( 'scan' )
            {
            // InternalMelangeurmodel.g:568:1: ( 'scan' )
            // InternalMelangeurmodel.g:569:2: 'scan'
            {
             before(grammarAccess.getMoveAccess().getScanKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getScanKeyword_1_0()); 

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
    // $ANTLR end "rule__Move__Group_1__0__Impl"


    // $ANTLR start "rule__Move__Group_1__1"
    // InternalMelangeurmodel.g:578:1: rule__Move__Group_1__1 : rule__Move__Group_1__1__Impl rule__Move__Group_1__2 ;
    public final void rule__Move__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:582:1: ( rule__Move__Group_1__1__Impl rule__Move__Group_1__2 )
            // InternalMelangeurmodel.g:583:2: rule__Move__Group_1__1__Impl rule__Move__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Move__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_1__2();

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
    // $ANTLR end "rule__Move__Group_1__1"


    // $ANTLR start "rule__Move__Group_1__1__Impl"
    // InternalMelangeurmodel.g:590:1: rule__Move__Group_1__1__Impl : ( 'if' ) ;
    public final void rule__Move__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:594:1: ( ( 'if' ) )
            // InternalMelangeurmodel.g:595:1: ( 'if' )
            {
            // InternalMelangeurmodel.g:595:1: ( 'if' )
            // InternalMelangeurmodel.g:596:2: 'if'
            {
             before(grammarAccess.getMoveAccess().getIfKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getIfKeyword_1_1()); 

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
    // $ANTLR end "rule__Move__Group_1__1__Impl"


    // $ANTLR start "rule__Move__Group_1__2"
    // InternalMelangeurmodel.g:605:1: rule__Move__Group_1__2 : rule__Move__Group_1__2__Impl rule__Move__Group_1__3 ;
    public final void rule__Move__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:609:1: ( rule__Move__Group_1__2__Impl rule__Move__Group_1__3 )
            // InternalMelangeurmodel.g:610:2: rule__Move__Group_1__2__Impl rule__Move__Group_1__3
            {
            pushFollow(FOLLOW_10);
            rule__Move__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_1__3();

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
    // $ANTLR end "rule__Move__Group_1__2"


    // $ANTLR start "rule__Move__Group_1__2__Impl"
    // InternalMelangeurmodel.g:617:1: rule__Move__Group_1__2__Impl : ( ( rule__Move__TypeAssignment_1_2 ) ) ;
    public final void rule__Move__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:621:1: ( ( ( rule__Move__TypeAssignment_1_2 ) ) )
            // InternalMelangeurmodel.g:622:1: ( ( rule__Move__TypeAssignment_1_2 ) )
            {
            // InternalMelangeurmodel.g:622:1: ( ( rule__Move__TypeAssignment_1_2 ) )
            // InternalMelangeurmodel.g:623:2: ( rule__Move__TypeAssignment_1_2 )
            {
             before(grammarAccess.getMoveAccess().getTypeAssignment_1_2()); 
            // InternalMelangeurmodel.g:624:2: ( rule__Move__TypeAssignment_1_2 )
            // InternalMelangeurmodel.g:624:3: rule__Move__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getTypeAssignment_1_2()); 

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
    // $ANTLR end "rule__Move__Group_1__2__Impl"


    // $ANTLR start "rule__Move__Group_1__3"
    // InternalMelangeurmodel.g:632:1: rule__Move__Group_1__3 : rule__Move__Group_1__3__Impl ;
    public final void rule__Move__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:636:1: ( rule__Move__Group_1__3__Impl )
            // InternalMelangeurmodel.g:637:2: rule__Move__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_1__3__Impl();

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
    // $ANTLR end "rule__Move__Group_1__3"


    // $ANTLR start "rule__Move__Group_1__3__Impl"
    // InternalMelangeurmodel.g:643:1: rule__Move__Group_1__3__Impl : ( ( rule__Move__QtyCupAssignment_1_3 ) ) ;
    public final void rule__Move__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:647:1: ( ( ( rule__Move__QtyCupAssignment_1_3 ) ) )
            // InternalMelangeurmodel.g:648:1: ( ( rule__Move__QtyCupAssignment_1_3 ) )
            {
            // InternalMelangeurmodel.g:648:1: ( ( rule__Move__QtyCupAssignment_1_3 ) )
            // InternalMelangeurmodel.g:649:2: ( rule__Move__QtyCupAssignment_1_3 )
            {
             before(grammarAccess.getMoveAccess().getQtyCupAssignment_1_3()); 
            // InternalMelangeurmodel.g:650:2: ( rule__Move__QtyCupAssignment_1_3 )
            // InternalMelangeurmodel.g:650:3: rule__Move__QtyCupAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Move__QtyCupAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getQtyCupAssignment_1_3()); 

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
    // $ANTLR end "rule__Move__Group_1__3__Impl"


    // $ANTLR start "rule__Move__Group_2__0"
    // InternalMelangeurmodel.g:659:1: rule__Move__Group_2__0 : rule__Move__Group_2__0__Impl rule__Move__Group_2__1 ;
    public final void rule__Move__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:663:1: ( rule__Move__Group_2__0__Impl rule__Move__Group_2__1 )
            // InternalMelangeurmodel.g:664:2: rule__Move__Group_2__0__Impl rule__Move__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Move__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_2__1();

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
    // $ANTLR end "rule__Move__Group_2__0"


    // $ANTLR start "rule__Move__Group_2__0__Impl"
    // InternalMelangeurmodel.g:671:1: rule__Move__Group_2__0__Impl : ( ( rule__Move__QtyAssignment_2_0 ) ) ;
    public final void rule__Move__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:675:1: ( ( ( rule__Move__QtyAssignment_2_0 ) ) )
            // InternalMelangeurmodel.g:676:1: ( ( rule__Move__QtyAssignment_2_0 ) )
            {
            // InternalMelangeurmodel.g:676:1: ( ( rule__Move__QtyAssignment_2_0 ) )
            // InternalMelangeurmodel.g:677:2: ( rule__Move__QtyAssignment_2_0 )
            {
             before(grammarAccess.getMoveAccess().getQtyAssignment_2_0()); 
            // InternalMelangeurmodel.g:678:2: ( rule__Move__QtyAssignment_2_0 )
            // InternalMelangeurmodel.g:678:3: rule__Move__QtyAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__QtyAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getQtyAssignment_2_0()); 

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
    // $ANTLR end "rule__Move__Group_2__0__Impl"


    // $ANTLR start "rule__Move__Group_2__1"
    // InternalMelangeurmodel.g:686:1: rule__Move__Group_2__1 : rule__Move__Group_2__1__Impl ;
    public final void rule__Move__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:690:1: ( rule__Move__Group_2__1__Impl )
            // InternalMelangeurmodel.g:691:2: rule__Move__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_2__1__Impl();

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
    // $ANTLR end "rule__Move__Group_2__1"


    // $ANTLR start "rule__Move__Group_2__1__Impl"
    // InternalMelangeurmodel.g:697:1: rule__Move__Group_2__1__Impl : ( 'ml' ) ;
    public final void rule__Move__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:701:1: ( ( 'ml' ) )
            // InternalMelangeurmodel.g:702:1: ( 'ml' )
            {
            // InternalMelangeurmodel.g:702:1: ( 'ml' )
            // InternalMelangeurmodel.g:703:2: 'ml'
            {
             before(grammarAccess.getMoveAccess().getMlKeyword_2_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMlKeyword_2_1()); 

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
    // $ANTLR end "rule__Move__Group_2__1__Impl"


    // $ANTLR start "rule__Move__Group_7__0"
    // InternalMelangeurmodel.g:713:1: rule__Move__Group_7__0 : rule__Move__Group_7__0__Impl rule__Move__Group_7__1 ;
    public final void rule__Move__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:717:1: ( rule__Move__Group_7__0__Impl rule__Move__Group_7__1 )
            // InternalMelangeurmodel.g:718:2: rule__Move__Group_7__0__Impl rule__Move__Group_7__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMelangeurmodel.g:725:1: rule__Move__Group_7__0__Impl : ( 'with' ) ;
    public final void rule__Move__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:729:1: ( ( 'with' ) )
            // InternalMelangeurmodel.g:730:1: ( 'with' )
            {
            // InternalMelangeurmodel.g:730:1: ( 'with' )
            // InternalMelangeurmodel.g:731:2: 'with'
            {
             before(grammarAccess.getMoveAccess().getWithKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:740:1: rule__Move__Group_7__1 : rule__Move__Group_7__1__Impl rule__Move__Group_7__2 ;
    public final void rule__Move__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:744:1: ( rule__Move__Group_7__1__Impl rule__Move__Group_7__2 )
            // InternalMelangeurmodel.g:745:2: rule__Move__Group_7__1__Impl rule__Move__Group_7__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMelangeurmodel.g:752:1: rule__Move__Group_7__1__Impl : ( 'filter' ) ;
    public final void rule__Move__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:756:1: ( ( 'filter' ) )
            // InternalMelangeurmodel.g:757:1: ( 'filter' )
            {
            // InternalMelangeurmodel.g:757:1: ( 'filter' )
            // InternalMelangeurmodel.g:758:2: 'filter'
            {
             before(grammarAccess.getMoveAccess().getFilterKeyword_7_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:767:1: rule__Move__Group_7__2 : rule__Move__Group_7__2__Impl ;
    public final void rule__Move__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:771:1: ( rule__Move__Group_7__2__Impl )
            // InternalMelangeurmodel.g:772:2: rule__Move__Group_7__2__Impl
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
    // InternalMelangeurmodel.g:778:1: rule__Move__Group_7__2__Impl : ( ( rule__Move__FilterAssignment_7_2 ) ) ;
    public final void rule__Move__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:782:1: ( ( ( rule__Move__FilterAssignment_7_2 ) ) )
            // InternalMelangeurmodel.g:783:1: ( ( rule__Move__FilterAssignment_7_2 ) )
            {
            // InternalMelangeurmodel.g:783:1: ( ( rule__Move__FilterAssignment_7_2 ) )
            // InternalMelangeurmodel.g:784:2: ( rule__Move__FilterAssignment_7_2 )
            {
             before(grammarAccess.getMoveAccess().getFilterAssignment_7_2()); 
            // InternalMelangeurmodel.g:785:2: ( rule__Move__FilterAssignment_7_2 )
            // InternalMelangeurmodel.g:785:3: rule__Move__FilterAssignment_7_2
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


    // $ANTLR start "rule__Move__Group_8__0"
    // InternalMelangeurmodel.g:794:1: rule__Move__Group_8__0 : rule__Move__Group_8__0__Impl rule__Move__Group_8__1 ;
    public final void rule__Move__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:798:1: ( rule__Move__Group_8__0__Impl rule__Move__Group_8__1 )
            // InternalMelangeurmodel.g:799:2: rule__Move__Group_8__0__Impl rule__Move__Group_8__1
            {
            pushFollow(FOLLOW_14);
            rule__Move__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_8__1();

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
    // $ANTLR end "rule__Move__Group_8__0"


    // $ANTLR start "rule__Move__Group_8__0__Impl"
    // InternalMelangeurmodel.g:806:1: rule__Move__Group_8__0__Impl : ( 'wait' ) ;
    public final void rule__Move__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:810:1: ( ( 'wait' ) )
            // InternalMelangeurmodel.g:811:1: ( 'wait' )
            {
            // InternalMelangeurmodel.g:811:1: ( 'wait' )
            // InternalMelangeurmodel.g:812:2: 'wait'
            {
             before(grammarAccess.getMoveAccess().getWaitKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getWaitKeyword_8_0()); 

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
    // $ANTLR end "rule__Move__Group_8__0__Impl"


    // $ANTLR start "rule__Move__Group_8__1"
    // InternalMelangeurmodel.g:821:1: rule__Move__Group_8__1 : rule__Move__Group_8__1__Impl rule__Move__Group_8__2 ;
    public final void rule__Move__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:825:1: ( rule__Move__Group_8__1__Impl rule__Move__Group_8__2 )
            // InternalMelangeurmodel.g:826:2: rule__Move__Group_8__1__Impl rule__Move__Group_8__2
            {
            pushFollow(FOLLOW_15);
            rule__Move__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_8__2();

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
    // $ANTLR end "rule__Move__Group_8__1"


    // $ANTLR start "rule__Move__Group_8__1__Impl"
    // InternalMelangeurmodel.g:833:1: rule__Move__Group_8__1__Impl : ( 'before' ) ;
    public final void rule__Move__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:837:1: ( ( 'before' ) )
            // InternalMelangeurmodel.g:838:1: ( 'before' )
            {
            // InternalMelangeurmodel.g:838:1: ( 'before' )
            // InternalMelangeurmodel.g:839:2: 'before'
            {
             before(grammarAccess.getMoveAccess().getBeforeKeyword_8_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getBeforeKeyword_8_1()); 

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
    // $ANTLR end "rule__Move__Group_8__1__Impl"


    // $ANTLR start "rule__Move__Group_8__2"
    // InternalMelangeurmodel.g:848:1: rule__Move__Group_8__2 : rule__Move__Group_8__2__Impl rule__Move__Group_8__3 ;
    public final void rule__Move__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:852:1: ( rule__Move__Group_8__2__Impl rule__Move__Group_8__3 )
            // InternalMelangeurmodel.g:853:2: rule__Move__Group_8__2__Impl rule__Move__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__Move__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group_8__3();

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
    // $ANTLR end "rule__Move__Group_8__2"


    // $ANTLR start "rule__Move__Group_8__2__Impl"
    // InternalMelangeurmodel.g:860:1: rule__Move__Group_8__2__Impl : ( 'clean' ) ;
    public final void rule__Move__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:864:1: ( ( 'clean' ) )
            // InternalMelangeurmodel.g:865:1: ( 'clean' )
            {
            // InternalMelangeurmodel.g:865:1: ( 'clean' )
            // InternalMelangeurmodel.g:866:2: 'clean'
            {
             before(grammarAccess.getMoveAccess().getCleanKeyword_8_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getCleanKeyword_8_2()); 

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
    // $ANTLR end "rule__Move__Group_8__2__Impl"


    // $ANTLR start "rule__Move__Group_8__3"
    // InternalMelangeurmodel.g:875:1: rule__Move__Group_8__3 : rule__Move__Group_8__3__Impl ;
    public final void rule__Move__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:879:1: ( rule__Move__Group_8__3__Impl )
            // InternalMelangeurmodel.g:880:2: rule__Move__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group_8__3__Impl();

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
    // $ANTLR end "rule__Move__Group_8__3"


    // $ANTLR start "rule__Move__Group_8__3__Impl"
    // InternalMelangeurmodel.g:886:1: rule__Move__Group_8__3__Impl : ( ( rule__Move__TimeAssignment_8_3 ) ) ;
    public final void rule__Move__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:890:1: ( ( ( rule__Move__TimeAssignment_8_3 ) ) )
            // InternalMelangeurmodel.g:891:1: ( ( rule__Move__TimeAssignment_8_3 ) )
            {
            // InternalMelangeurmodel.g:891:1: ( ( rule__Move__TimeAssignment_8_3 ) )
            // InternalMelangeurmodel.g:892:2: ( rule__Move__TimeAssignment_8_3 )
            {
             before(grammarAccess.getMoveAccess().getTimeAssignment_8_3()); 
            // InternalMelangeurmodel.g:893:2: ( rule__Move__TimeAssignment_8_3 )
            // InternalMelangeurmodel.g:893:3: rule__Move__TimeAssignment_8_3
            {
            pushFollow(FOLLOW_2);
            rule__Move__TimeAssignment_8_3();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getTimeAssignment_8_3()); 

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
    // $ANTLR end "rule__Move__Group_8__3__Impl"


    // $ANTLR start "rule__Datatype__Group__0"
    // InternalMelangeurmodel.g:902:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:906:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // InternalMelangeurmodel.g:907:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Datatype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__1();

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
    // $ANTLR end "rule__Datatype__Group__0"


    // $ANTLR start "rule__Datatype__Group__0__Impl"
    // InternalMelangeurmodel.g:914:1: rule__Datatype__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:918:1: ( ( 'datatype' ) )
            // InternalMelangeurmodel.g:919:1: ( 'datatype' )
            {
            // InternalMelangeurmodel.g:919:1: ( 'datatype' )
            // InternalMelangeurmodel.g:920:2: 'datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__Datatype__Group__0__Impl"


    // $ANTLR start "rule__Datatype__Group__1"
    // InternalMelangeurmodel.g:929:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl rule__Datatype__Group__2 ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:933:1: ( rule__Datatype__Group__1__Impl rule__Datatype__Group__2 )
            // InternalMelangeurmodel.g:934:2: rule__Datatype__Group__1__Impl rule__Datatype__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Datatype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Datatype__Group__2();

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
    // $ANTLR end "rule__Datatype__Group__1"


    // $ANTLR start "rule__Datatype__Group__1__Impl"
    // InternalMelangeurmodel.g:941:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:945:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // InternalMelangeurmodel.g:946:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // InternalMelangeurmodel.g:946:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // InternalMelangeurmodel.g:947:2: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // InternalMelangeurmodel.g:948:2: ( rule__Datatype__NameAssignment_1 )
            // InternalMelangeurmodel.g:948:3: rule__Datatype__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Datatype__Group__1__Impl"


    // $ANTLR start "rule__Datatype__Group__2"
    // InternalMelangeurmodel.g:956:1: rule__Datatype__Group__2 : rule__Datatype__Group__2__Impl ;
    public final void rule__Datatype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:960:1: ( rule__Datatype__Group__2__Impl )
            // InternalMelangeurmodel.g:961:2: rule__Datatype__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Group__2__Impl();

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
    // $ANTLR end "rule__Datatype__Group__2"


    // $ANTLR start "rule__Datatype__Group__2__Impl"
    // InternalMelangeurmodel.g:967:1: rule__Datatype__Group__2__Impl : ( ( rule__Datatype__VarnameAssignment_2 ) ) ;
    public final void rule__Datatype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:971:1: ( ( ( rule__Datatype__VarnameAssignment_2 ) ) )
            // InternalMelangeurmodel.g:972:1: ( ( rule__Datatype__VarnameAssignment_2 ) )
            {
            // InternalMelangeurmodel.g:972:1: ( ( rule__Datatype__VarnameAssignment_2 ) )
            // InternalMelangeurmodel.g:973:2: ( rule__Datatype__VarnameAssignment_2 )
            {
             before(grammarAccess.getDatatypeAccess().getVarnameAssignment_2()); 
            // InternalMelangeurmodel.g:974:2: ( rule__Datatype__VarnameAssignment_2 )
            // InternalMelangeurmodel.g:974:3: rule__Datatype__VarnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__VarnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getVarnameAssignment_2()); 

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
    // $ANTLR end "rule__Datatype__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMelangeurmodel.g:983:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:987:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMelangeurmodel.g:988:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMelangeurmodel.g:995:1: rule__Variable__Group__0__Impl : ( 'variable' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:999:1: ( ( 'variable' ) )
            // InternalMelangeurmodel.g:1000:1: ( 'variable' )
            {
            // InternalMelangeurmodel.g:1000:1: ( 'variable' )
            // InternalMelangeurmodel.g:1001:2: 'variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMelangeurmodel.g:1010:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1014:1: ( rule__Variable__Group__1__Impl )
            // InternalMelangeurmodel.g:1015:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMelangeurmodel.g:1021:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1025:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMelangeurmodel.g:1026:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMelangeurmodel.g:1026:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMelangeurmodel.g:1027:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMelangeurmodel.g:1028:2: ( rule__Variable__NameAssignment_1 )
            // InternalMelangeurmodel.g:1028:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Cup__Group__0"
    // InternalMelangeurmodel.g:1037:1: rule__Cup__Group__0 : rule__Cup__Group__0__Impl rule__Cup__Group__1 ;
    public final void rule__Cup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1041:1: ( rule__Cup__Group__0__Impl rule__Cup__Group__1 )
            // InternalMelangeurmodel.g:1042:2: rule__Cup__Group__0__Impl rule__Cup__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMelangeurmodel.g:1049:1: rule__Cup__Group__0__Impl : ( 'cup' ) ;
    public final void rule__Cup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1053:1: ( ( 'cup' ) )
            // InternalMelangeurmodel.g:1054:1: ( 'cup' )
            {
            // InternalMelangeurmodel.g:1054:1: ( 'cup' )
            // InternalMelangeurmodel.g:1055:2: 'cup'
            {
             before(grammarAccess.getCupAccess().getCupKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:1064:1: rule__Cup__Group__1 : rule__Cup__Group__1__Impl ;
    public final void rule__Cup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1068:1: ( rule__Cup__Group__1__Impl )
            // InternalMelangeurmodel.g:1069:2: rule__Cup__Group__1__Impl
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
    // InternalMelangeurmodel.g:1075:1: rule__Cup__Group__1__Impl : ( ( rule__Cup__NrAssignment_1 ) ) ;
    public final void rule__Cup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1079:1: ( ( ( rule__Cup__NrAssignment_1 ) ) )
            // InternalMelangeurmodel.g:1080:1: ( ( rule__Cup__NrAssignment_1 ) )
            {
            // InternalMelangeurmodel.g:1080:1: ( ( rule__Cup__NrAssignment_1 ) )
            // InternalMelangeurmodel.g:1081:2: ( rule__Cup__NrAssignment_1 )
            {
             before(grammarAccess.getCupAccess().getNrAssignment_1()); 
            // InternalMelangeurmodel.g:1082:2: ( rule__Cup__NrAssignment_1 )
            // InternalMelangeurmodel.g:1082:3: rule__Cup__NrAssignment_1
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
    // InternalMelangeurmodel.g:1091:1: rule__Clean__Group__0 : rule__Clean__Group__0__Impl rule__Clean__Group__1 ;
    public final void rule__Clean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1095:1: ( rule__Clean__Group__0__Impl rule__Clean__Group__1 )
            // InternalMelangeurmodel.g:1096:2: rule__Clean__Group__0__Impl rule__Clean__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMelangeurmodel.g:1103:1: rule__Clean__Group__0__Impl : ( () ) ;
    public final void rule__Clean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1107:1: ( ( () ) )
            // InternalMelangeurmodel.g:1108:1: ( () )
            {
            // InternalMelangeurmodel.g:1108:1: ( () )
            // InternalMelangeurmodel.g:1109:2: ()
            {
             before(grammarAccess.getCleanAccess().getCleanAction_0()); 
            // InternalMelangeurmodel.g:1110:2: ()
            // InternalMelangeurmodel.g:1110:3: 
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
    // InternalMelangeurmodel.g:1118:1: rule__Clean__Group__1 : rule__Clean__Group__1__Impl ;
    public final void rule__Clean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1122:1: ( rule__Clean__Group__1__Impl )
            // InternalMelangeurmodel.g:1123:2: rule__Clean__Group__1__Impl
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
    // InternalMelangeurmodel.g:1129:1: rule__Clean__Group__1__Impl : ( 'cleanup' ) ;
    public final void rule__Clean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1133:1: ( ( 'cleanup' ) )
            // InternalMelangeurmodel.g:1134:1: ( 'cleanup' )
            {
            // InternalMelangeurmodel.g:1134:1: ( 'cleanup' )
            // InternalMelangeurmodel.g:1135:2: 'cleanup'
            {
             before(grammarAccess.getCleanAccess().getCleanupKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMelangeurmodel.g:1145:1: rule__Model__InstructionAssignment : ( ruleInstruction ) ;
    public final void rule__Model__InstructionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1149:1: ( ( ruleInstruction ) )
            // InternalMelangeurmodel.g:1150:2: ( ruleInstruction )
            {
            // InternalMelangeurmodel.g:1150:2: ( ruleInstruction )
            // InternalMelangeurmodel.g:1151:3: ruleInstruction
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


    // $ANTLR start "rule__Move__MoveAssignment_0"
    // InternalMelangeurmodel.g:1160:1: rule__Move__MoveAssignment_0 : ( ( 'move' ) ) ;
    public final void rule__Move__MoveAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1164:1: ( ( ( 'move' ) ) )
            // InternalMelangeurmodel.g:1165:2: ( ( 'move' ) )
            {
            // InternalMelangeurmodel.g:1165:2: ( ( 'move' ) )
            // InternalMelangeurmodel.g:1166:3: ( 'move' )
            {
             before(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); 
            // InternalMelangeurmodel.g:1167:3: ( 'move' )
            // InternalMelangeurmodel.g:1168:4: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); 

            }

             after(grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0()); 

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
    // $ANTLR end "rule__Move__MoveAssignment_0"


    // $ANTLR start "rule__Move__TypeAssignment_1_2"
    // InternalMelangeurmodel.g:1179:1: rule__Move__TypeAssignment_1_2 : ( ( rule__Move__TypeAlternatives_1_2_0 ) ) ;
    public final void rule__Move__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1183:1: ( ( ( rule__Move__TypeAlternatives_1_2_0 ) ) )
            // InternalMelangeurmodel.g:1184:2: ( ( rule__Move__TypeAlternatives_1_2_0 ) )
            {
            // InternalMelangeurmodel.g:1184:2: ( ( rule__Move__TypeAlternatives_1_2_0 ) )
            // InternalMelangeurmodel.g:1185:3: ( rule__Move__TypeAlternatives_1_2_0 )
            {
             before(grammarAccess.getMoveAccess().getTypeAlternatives_1_2_0()); 
            // InternalMelangeurmodel.g:1186:3: ( rule__Move__TypeAlternatives_1_2_0 )
            // InternalMelangeurmodel.g:1186:4: rule__Move__TypeAlternatives_1_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__TypeAlternatives_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getTypeAlternatives_1_2_0()); 

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
    // $ANTLR end "rule__Move__TypeAssignment_1_2"


    // $ANTLR start "rule__Move__QtyCupAssignment_1_3"
    // InternalMelangeurmodel.g:1194:1: rule__Move__QtyCupAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__Move__QtyCupAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1198:1: ( ( RULE_INT ) )
            // InternalMelangeurmodel.g:1199:2: ( RULE_INT )
            {
            // InternalMelangeurmodel.g:1199:2: ( RULE_INT )
            // InternalMelangeurmodel.g:1200:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getQtyCupINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getQtyCupINTTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__Move__QtyCupAssignment_1_3"


    // $ANTLR start "rule__Move__QtyAssignment_2_0"
    // InternalMelangeurmodel.g:1209:1: rule__Move__QtyAssignment_2_0 : ( RULE_INT ) ;
    public final void rule__Move__QtyAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1213:1: ( ( RULE_INT ) )
            // InternalMelangeurmodel.g:1214:2: ( RULE_INT )
            {
            // InternalMelangeurmodel.g:1214:2: ( RULE_INT )
            // InternalMelangeurmodel.g:1215:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_2_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Move__QtyAssignment_2_0"


    // $ANTLR start "rule__Move__FromAssignment_4"
    // InternalMelangeurmodel.g:1224:1: rule__Move__FromAssignment_4 : ( ruleCup ) ;
    public final void rule__Move__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1228:1: ( ( ruleCup ) )
            // InternalMelangeurmodel.g:1229:2: ( ruleCup )
            {
            // InternalMelangeurmodel.g:1229:2: ( ruleCup )
            // InternalMelangeurmodel.g:1230:3: ruleCup
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
    // InternalMelangeurmodel.g:1239:1: rule__Move__ToAssignment_6 : ( ruleCup ) ;
    public final void rule__Move__ToAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1243:1: ( ( ruleCup ) )
            // InternalMelangeurmodel.g:1244:2: ( ruleCup )
            {
            // InternalMelangeurmodel.g:1244:2: ( ruleCup )
            // InternalMelangeurmodel.g:1245:3: ruleCup
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
    // InternalMelangeurmodel.g:1254:1: rule__Move__FilterAssignment_7_2 : ( ( rule__Move__FilterAlternatives_7_2_0 ) ) ;
    public final void rule__Move__FilterAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1258:1: ( ( ( rule__Move__FilterAlternatives_7_2_0 ) ) )
            // InternalMelangeurmodel.g:1259:2: ( ( rule__Move__FilterAlternatives_7_2_0 ) )
            {
            // InternalMelangeurmodel.g:1259:2: ( ( rule__Move__FilterAlternatives_7_2_0 ) )
            // InternalMelangeurmodel.g:1260:3: ( rule__Move__FilterAlternatives_7_2_0 )
            {
             before(grammarAccess.getMoveAccess().getFilterAlternatives_7_2_0()); 
            // InternalMelangeurmodel.g:1261:3: ( rule__Move__FilterAlternatives_7_2_0 )
            // InternalMelangeurmodel.g:1261:4: rule__Move__FilterAlternatives_7_2_0
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


    // $ANTLR start "rule__Move__TimeAssignment_8_3"
    // InternalMelangeurmodel.g:1269:1: rule__Move__TimeAssignment_8_3 : ( RULE_INT ) ;
    public final void rule__Move__TimeAssignment_8_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1273:1: ( ( RULE_INT ) )
            // InternalMelangeurmodel.g:1274:2: ( RULE_INT )
            {
            // InternalMelangeurmodel.g:1274:2: ( RULE_INT )
            // InternalMelangeurmodel.g:1275:3: RULE_INT
            {
             before(grammarAccess.getMoveAccess().getTimeINTTerminalRuleCall_8_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getTimeINTTerminalRuleCall_8_3_0()); 

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
    // $ANTLR end "rule__Move__TimeAssignment_8_3"


    // $ANTLR start "rule__Datatype__NameAssignment_1"
    // InternalMelangeurmodel.g:1284:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1288:1: ( ( RULE_ID ) )
            // InternalMelangeurmodel.g:1289:2: ( RULE_ID )
            {
            // InternalMelangeurmodel.g:1289:2: ( RULE_ID )
            // InternalMelangeurmodel.g:1290:3: RULE_ID
            {
             before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Datatype__NameAssignment_1"


    // $ANTLR start "rule__Datatype__VarnameAssignment_2"
    // InternalMelangeurmodel.g:1299:1: rule__Datatype__VarnameAssignment_2 : ( ruleVariable ) ;
    public final void rule__Datatype__VarnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1303:1: ( ( ruleVariable ) )
            // InternalMelangeurmodel.g:1304:2: ( ruleVariable )
            {
            // InternalMelangeurmodel.g:1304:2: ( ruleVariable )
            // InternalMelangeurmodel.g:1305:3: ruleVariable
            {
             before(grammarAccess.getDatatypeAccess().getVarnameVariableParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDatatypeAccess().getVarnameVariableParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Datatype__VarnameAssignment_2"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMelangeurmodel.g:1314:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1318:1: ( ( RULE_ID ) )
            // InternalMelangeurmodel.g:1319:2: ( RULE_ID )
            {
            // InternalMelangeurmodel.g:1319:2: ( RULE_ID )
            // InternalMelangeurmodel.g:1320:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Cup__NrAssignment_1"
    // InternalMelangeurmodel.g:1329:1: rule__Cup__NrAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cup__NrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMelangeurmodel.g:1333:1: ( ( RULE_INT ) )
            // InternalMelangeurmodel.g:1334:2: ( RULE_INT )
            {
            // InternalMelangeurmodel.g:1334:2: ( RULE_INT )
            // InternalMelangeurmodel.g:1335:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C8000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});

}