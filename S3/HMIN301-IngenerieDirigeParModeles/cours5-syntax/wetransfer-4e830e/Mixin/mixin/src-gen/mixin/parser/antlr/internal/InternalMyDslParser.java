package mixin.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mixin.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'move'", "'ml'", "'from'", "'to'", "'with'", "'filter'", "'A'", "'B'", "'cup'", "'cleanup'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_instruction_0_0= ruleInstruction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_instruction_0_0= ruleInstruction ) )* )
            // InternalMyDsl.g:78:2: ( (lv_instruction_0_0= ruleInstruction ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_instruction_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_instruction_0_0= ruleInstruction )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_instruction_0_0= ruleInstruction )
            	    // InternalMyDsl.g:80:4: lv_instruction_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getInstructionInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instruction_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instruction",
            	    					lv_instruction_0_0,
            	    					"mixin.MyDsl.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:100:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:100:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:101:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:107:1: ruleInstruction returns [EObject current=null] : (this_Move_0= ruleMove | this_Clean_1= ruleClean ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Clean_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_Move_0= ruleMove | this_Clean_1= ruleClean ) )
            // InternalMyDsl.g:114:2: (this_Move_0= ruleMove | this_Clean_1= ruleClean )
            {
            // InternalMyDsl.g:114:2: (this_Move_0= ruleMove | this_Clean_1= ruleClean )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
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
                    // InternalMyDsl.g:115:3: this_Move_0= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMoveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_0=ruleMove();

                    state._fsp--;


                    			current = this_Move_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_Clean_1= ruleClean
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clean_1=ruleClean();

                    state._fsp--;


                    			current = this_Clean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleMove"
    // InternalMyDsl.g:136:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalMyDsl.g:136:45: (iv_ruleMove= ruleMove EOF )
            // InternalMyDsl.g:137:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalMyDsl.g:143:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' ( (lv_qty_1_0= RULE_INT ) ) otherlv_2= 'ml' otherlv_3= 'from' ( (lv_from_4_0= ruleCup ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleCup ) ) (otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_qty_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_filter_9_1=null;
        Token lv_filter_9_2=null;
        EObject lv_from_4_0 = null;

        EObject lv_to_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:149:2: ( (otherlv_0= 'move' ( (lv_qty_1_0= RULE_INT ) ) otherlv_2= 'ml' otherlv_3= 'from' ( (lv_from_4_0= ruleCup ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleCup ) ) (otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) ) )? ) )
            // InternalMyDsl.g:150:2: (otherlv_0= 'move' ( (lv_qty_1_0= RULE_INT ) ) otherlv_2= 'ml' otherlv_3= 'from' ( (lv_from_4_0= ruleCup ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleCup ) ) (otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) ) )? )
            {
            // InternalMyDsl.g:150:2: (otherlv_0= 'move' ( (lv_qty_1_0= RULE_INT ) ) otherlv_2= 'ml' otherlv_3= 'from' ( (lv_from_4_0= ruleCup ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleCup ) ) (otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) ) )? )
            // InternalMyDsl.g:151:3: otherlv_0= 'move' ( (lv_qty_1_0= RULE_INT ) ) otherlv_2= 'ml' otherlv_3= 'from' ( (lv_from_4_0= ruleCup ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleCup ) ) (otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            // InternalMyDsl.g:155:3: ( (lv_qty_1_0= RULE_INT ) )
            // InternalMyDsl.g:156:4: (lv_qty_1_0= RULE_INT )
            {
            // InternalMyDsl.g:156:4: (lv_qty_1_0= RULE_INT )
            // InternalMyDsl.g:157:5: lv_qty_1_0= RULE_INT
            {
            lv_qty_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_qty_1_0, grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"qty",
            						lv_qty_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getMlKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMoveAccess().getFromKeyword_3());
            		
            // InternalMyDsl.g:181:3: ( (lv_from_4_0= ruleCup ) )
            // InternalMyDsl.g:182:4: (lv_from_4_0= ruleCup )
            {
            // InternalMyDsl.g:182:4: (lv_from_4_0= ruleCup )
            // InternalMyDsl.g:183:5: lv_from_4_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getFromCupParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_from_4_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_4_0,
            						"mixin.MyDsl.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMoveAccess().getToKeyword_5());
            		
            // InternalMyDsl.g:204:3: ( (lv_to_6_0= ruleCup ) )
            // InternalMyDsl.g:205:4: (lv_to_6_0= ruleCup )
            {
            // InternalMyDsl.g:205:4: (lv_to_6_0= ruleCup )
            // InternalMyDsl.g:206:5: lv_to_6_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getToCupParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_to_6_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_6_0,
            						"mixin.MyDsl.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:223:3: (otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:224:4: otherlv_7= 'with' otherlv_8= 'filter' ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getWithKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getMoveAccess().getFilterKeyword_7_1());
                    			
                    // InternalMyDsl.g:232:4: ( ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) ) )
                    // InternalMyDsl.g:233:5: ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) )
                    {
                    // InternalMyDsl.g:233:5: ( (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' ) )
                    // InternalMyDsl.g:234:6: (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' )
                    {
                    // InternalMyDsl.g:234:6: (lv_filter_9_1= 'A' | lv_filter_9_2= 'B' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==17) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==18) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalMyDsl.g:235:7: lv_filter_9_1= 'A'
                            {
                            lv_filter_9_1=(Token)match(input,17,FOLLOW_2); 

                            							newLeafNode(lv_filter_9_1, grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "filter", lv_filter_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:246:7: lv_filter_9_2= 'B'
                            {
                            lv_filter_9_2=(Token)match(input,18,FOLLOW_2); 

                            							newLeafNode(lv_filter_9_2, grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "filter", lv_filter_9_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleCup"
    // InternalMyDsl.g:264:1: entryRuleCup returns [EObject current=null] : iv_ruleCup= ruleCup EOF ;
    public final EObject entryRuleCup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCup = null;


        try {
            // InternalMyDsl.g:264:44: (iv_ruleCup= ruleCup EOF )
            // InternalMyDsl.g:265:2: iv_ruleCup= ruleCup EOF
            {
             newCompositeNode(grammarAccess.getCupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCup=ruleCup();

            state._fsp--;

             current =iv_ruleCup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCup"


    // $ANTLR start "ruleCup"
    // InternalMyDsl.g:271:1: ruleCup returns [EObject current=null] : (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nr_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:277:2: ( (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:278:2: (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:278:2: (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:279:3: otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCupAccess().getCupKeyword_0());
            		
            // InternalMyDsl.g:283:3: ( (lv_nr_1_0= RULE_INT ) )
            // InternalMyDsl.g:284:4: (lv_nr_1_0= RULE_INT )
            {
            // InternalMyDsl.g:284:4: (lv_nr_1_0= RULE_INT )
            // InternalMyDsl.g:285:5: lv_nr_1_0= RULE_INT
            {
            lv_nr_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_nr_1_0, grammarAccess.getCupAccess().getNrINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nr",
            						lv_nr_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCup"


    // $ANTLR start "entryRuleClean"
    // InternalMyDsl.g:305:1: entryRuleClean returns [EObject current=null] : iv_ruleClean= ruleClean EOF ;
    public final EObject entryRuleClean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClean = null;


        try {
            // InternalMyDsl.g:305:46: (iv_ruleClean= ruleClean EOF )
            // InternalMyDsl.g:306:2: iv_ruleClean= ruleClean EOF
            {
             newCompositeNode(grammarAccess.getCleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClean=ruleClean();

            state._fsp--;

             current =iv_ruleClean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClean"


    // $ANTLR start "ruleClean"
    // InternalMyDsl.g:312:1: ruleClean returns [EObject current=null] : ( () otherlv_1= 'cleanup' ) ;
    public final EObject ruleClean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:318:2: ( ( () otherlv_1= 'cleanup' ) )
            // InternalMyDsl.g:319:2: ( () otherlv_1= 'cleanup' )
            {
            // InternalMyDsl.g:319:2: ( () otherlv_1= 'cleanup' )
            // InternalMyDsl.g:320:3: () otherlv_1= 'cleanup'
            {
            // InternalMyDsl.g:320:3: ()
            // InternalMyDsl.g:321:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCleanAccess().getCleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCleanAccess().getCleanupKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});

}