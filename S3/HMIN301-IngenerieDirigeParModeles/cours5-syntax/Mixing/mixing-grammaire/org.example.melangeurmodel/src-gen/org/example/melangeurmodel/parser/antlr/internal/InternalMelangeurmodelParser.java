package org.example.melangeurmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.example.melangeurmodel.services.MelangeurmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMelangeurmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'move'", "'scan'", "'if'", "'less'", "'more'", "'equal'", "'diff'", "'ml'", "'from'", "'to'", "'with'", "'filter'", "'A'", "'B'", "'wait'", "'before'", "'clean'", "'datatype'", "'variable'", "'cup'", "'cleanup'"
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

        public InternalMelangeurmodelParser(TokenStream input, MelangeurmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MelangeurmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMelangeurmodel.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMelangeurmodel.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMelangeurmodel.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMelangeurmodel.g:71:1: ruleModel returns [EObject current=null] : ( (lv_instruction_0_0= ruleInstruction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;



        	enterRule();

        try {
            // InternalMelangeurmodel.g:77:2: ( ( (lv_instruction_0_0= ruleInstruction ) )* )
            // InternalMelangeurmodel.g:78:2: ( (lv_instruction_0_0= ruleInstruction ) )*
            {
            // InternalMelangeurmodel.g:78:2: ( (lv_instruction_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==28||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMelangeurmodel.g:79:3: (lv_instruction_0_0= ruleInstruction )
            	    {
            	    // InternalMelangeurmodel.g:79:3: (lv_instruction_0_0= ruleInstruction )
            	    // InternalMelangeurmodel.g:80:4: lv_instruction_0_0= ruleInstruction
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
            	    					"org.example.melangeurmodel.Melangeurmodel.Instruction");
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
    // InternalMelangeurmodel.g:100:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMelangeurmodel.g:100:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMelangeurmodel.g:101:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalMelangeurmodel.g:107:1: ruleInstruction returns [EObject current=null] : (this_Move_0= ruleMove | this_Clean_1= ruleClean | this_Datatype_2= ruleDatatype ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Move_0 = null;

        EObject this_Clean_1 = null;

        EObject this_Datatype_2 = null;



        	enterRule();

        try {
            // InternalMelangeurmodel.g:113:2: ( (this_Move_0= ruleMove | this_Clean_1= ruleClean | this_Datatype_2= ruleDatatype ) )
            // InternalMelangeurmodel.g:114:2: (this_Move_0= ruleMove | this_Clean_1= ruleClean | this_Datatype_2= ruleDatatype )
            {
            // InternalMelangeurmodel.g:114:2: (this_Move_0= ruleMove | this_Clean_1= ruleClean | this_Datatype_2= ruleDatatype )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 28:
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
                    // InternalMelangeurmodel.g:115:3: this_Move_0= ruleMove
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
                    // InternalMelangeurmodel.g:124:3: this_Clean_1= ruleClean
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCleanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clean_1=ruleClean();

                    state._fsp--;


                    			current = this_Clean_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMelangeurmodel.g:133:3: this_Datatype_2= ruleDatatype
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getDatatypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Datatype_2=ruleDatatype();

                    state._fsp--;


                    			current = this_Datatype_2;
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
    // InternalMelangeurmodel.g:145:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalMelangeurmodel.g:145:45: (iv_ruleMove= ruleMove EOF )
            // InternalMelangeurmodel.g:146:2: iv_ruleMove= ruleMove EOF
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
    // InternalMelangeurmodel.g:152:1: ruleMove returns [EObject current=null] : ( ( (lv_move_0_0= 'move' ) ) (otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) ) )? ( ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml' )? otherlv_7= 'from' ( (lv_from_8_0= ruleCup ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleCup ) ) (otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) ) )? (otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) ) )? ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token lv_move_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_qtyCup_4_0=null;
        Token lv_qty_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_filter_13_1=null;
        Token lv_filter_13_2=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_time_17_0=null;
        EObject lv_from_8_0 = null;

        EObject lv_to_10_0 = null;



        	enterRule();

        try {
            // InternalMelangeurmodel.g:158:2: ( ( ( (lv_move_0_0= 'move' ) ) (otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) ) )? ( ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml' )? otherlv_7= 'from' ( (lv_from_8_0= ruleCup ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleCup ) ) (otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) ) )? (otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) ) )? ) )
            // InternalMelangeurmodel.g:159:2: ( ( (lv_move_0_0= 'move' ) ) (otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) ) )? ( ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml' )? otherlv_7= 'from' ( (lv_from_8_0= ruleCup ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleCup ) ) (otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) ) )? (otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) ) )? )
            {
            // InternalMelangeurmodel.g:159:2: ( ( (lv_move_0_0= 'move' ) ) (otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) ) )? ( ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml' )? otherlv_7= 'from' ( (lv_from_8_0= ruleCup ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleCup ) ) (otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) ) )? (otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) ) )? )
            // InternalMelangeurmodel.g:160:3: ( (lv_move_0_0= 'move' ) ) (otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) ) )? ( ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml' )? otherlv_7= 'from' ( (lv_from_8_0= ruleCup ) ) otherlv_9= 'to' ( (lv_to_10_0= ruleCup ) ) (otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) ) )? (otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) ) )?
            {
            // InternalMelangeurmodel.g:160:3: ( (lv_move_0_0= 'move' ) )
            // InternalMelangeurmodel.g:161:4: (lv_move_0_0= 'move' )
            {
            // InternalMelangeurmodel.g:161:4: (lv_move_0_0= 'move' )
            // InternalMelangeurmodel.g:162:5: lv_move_0_0= 'move'
            {
            lv_move_0_0=(Token)match(input,11,FOLLOW_4); 

            					newLeafNode(lv_move_0_0, grammarAccess.getMoveAccess().getMoveMoveKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveRule());
            					}
            					setWithLastConsumed(current, "move", lv_move_0_0, "move");
            				

            }


            }

            // InternalMelangeurmodel.g:174:3: (otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMelangeurmodel.g:175:4: otherlv_1= 'scan' otherlv_2= 'if' ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) ) ( (lv_qtyCup_4_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getScanKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoveAccess().getIfKeyword_1_1());
                    			
                    // InternalMelangeurmodel.g:183:4: ( ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) ) )
                    // InternalMelangeurmodel.g:184:5: ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) )
                    {
                    // InternalMelangeurmodel.g:184:5: ( (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' ) )
                    // InternalMelangeurmodel.g:185:6: (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' )
                    {
                    // InternalMelangeurmodel.g:185:6: (lv_type_3_1= 'less' | lv_type_3_2= 'more' | lv_type_3_3= 'equal' | lv_type_3_4= 'diff' )
                    int alt3=4;
                    switch ( input.LA(1) ) {
                    case 14:
                        {
                        alt3=1;
                        }
                        break;
                    case 15:
                        {
                        alt3=2;
                        }
                        break;
                    case 16:
                        {
                        alt3=3;
                        }
                        break;
                    case 17:
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
                            // InternalMelangeurmodel.g:186:7: lv_type_3_1= 'less'
                            {
                            lv_type_3_1=(Token)match(input,14,FOLLOW_7); 

                            							newLeafNode(lv_type_3_1, grammarAccess.getMoveAccess().getTypeLessKeyword_1_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMelangeurmodel.g:197:7: lv_type_3_2= 'more'
                            {
                            lv_type_3_2=(Token)match(input,15,FOLLOW_7); 

                            							newLeafNode(lv_type_3_2, grammarAccess.getMoveAccess().getTypeMoreKeyword_1_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_3_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalMelangeurmodel.g:208:7: lv_type_3_3= 'equal'
                            {
                            lv_type_3_3=(Token)match(input,16,FOLLOW_7); 

                            							newLeafNode(lv_type_3_3, grammarAccess.getMoveAccess().getTypeEqualKeyword_1_2_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_3_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalMelangeurmodel.g:219:7: lv_type_3_4= 'diff'
                            {
                            lv_type_3_4=(Token)match(input,17,FOLLOW_7); 

                            							newLeafNode(lv_type_3_4, grammarAccess.getMoveAccess().getTypeDiffKeyword_1_2_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "type", lv_type_3_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalMelangeurmodel.g:232:4: ( (lv_qtyCup_4_0= RULE_INT ) )
                    // InternalMelangeurmodel.g:233:5: (lv_qtyCup_4_0= RULE_INT )
                    {
                    // InternalMelangeurmodel.g:233:5: (lv_qtyCup_4_0= RULE_INT )
                    // InternalMelangeurmodel.g:234:6: lv_qtyCup_4_0= RULE_INT
                    {
                    lv_qtyCup_4_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_qtyCup_4_0, grammarAccess.getMoveAccess().getQtyCupINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"qtyCup",
                    							lv_qtyCup_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMelangeurmodel.g:251:3: ( ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMelangeurmodel.g:252:4: ( (lv_qty_5_0= RULE_INT ) ) otherlv_6= 'ml'
                    {
                    // InternalMelangeurmodel.g:252:4: ( (lv_qty_5_0= RULE_INT ) )
                    // InternalMelangeurmodel.g:253:5: (lv_qty_5_0= RULE_INT )
                    {
                    // InternalMelangeurmodel.g:253:5: (lv_qty_5_0= RULE_INT )
                    // InternalMelangeurmodel.g:254:6: lv_qty_5_0= RULE_INT
                    {
                    lv_qty_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    						newLeafNode(lv_qty_5_0, grammarAccess.getMoveAccess().getQtyINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"qty",
                    							lv_qty_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getMoveAccess().getMlKeyword_2_1());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getMoveAccess().getFromKeyword_3());
            		
            // InternalMelangeurmodel.g:279:3: ( (lv_from_8_0= ruleCup ) )
            // InternalMelangeurmodel.g:280:4: (lv_from_8_0= ruleCup )
            {
            // InternalMelangeurmodel.g:280:4: (lv_from_8_0= ruleCup )
            // InternalMelangeurmodel.g:281:5: lv_from_8_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getFromCupParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_from_8_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_8_0,
            						"org.example.melangeurmodel.Melangeurmodel.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getMoveAccess().getToKeyword_5());
            		
            // InternalMelangeurmodel.g:302:3: ( (lv_to_10_0= ruleCup ) )
            // InternalMelangeurmodel.g:303:4: (lv_to_10_0= ruleCup )
            {
            // InternalMelangeurmodel.g:303:4: (lv_to_10_0= ruleCup )
            // InternalMelangeurmodel.g:304:5: lv_to_10_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getToCupParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
            lv_to_10_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_10_0,
            						"org.example.melangeurmodel.Melangeurmodel.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMelangeurmodel.g:321:3: (otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMelangeurmodel.g:322:4: otherlv_11= 'with' otherlv_12= 'filter' ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMoveAccess().getWithKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getMoveAccess().getFilterKeyword_7_1());
                    			
                    // InternalMelangeurmodel.g:330:4: ( ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) ) )
                    // InternalMelangeurmodel.g:331:5: ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) )
                    {
                    // InternalMelangeurmodel.g:331:5: ( (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' ) )
                    // InternalMelangeurmodel.g:332:6: (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' )
                    {
                    // InternalMelangeurmodel.g:332:6: (lv_filter_13_1= 'A' | lv_filter_13_2= 'B' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==23) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==24) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMelangeurmodel.g:333:7: lv_filter_13_1= 'A'
                            {
                            lv_filter_13_1=(Token)match(input,23,FOLLOW_16); 

                            							newLeafNode(lv_filter_13_1, grammarAccess.getMoveAccess().getFilterAKeyword_7_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "filter", lv_filter_13_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMelangeurmodel.g:344:7: lv_filter_13_2= 'B'
                            {
                            lv_filter_13_2=(Token)match(input,24,FOLLOW_16); 

                            							newLeafNode(lv_filter_13_2, grammarAccess.getMoveAccess().getFilterBKeyword_7_2_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMoveRule());
                            							}
                            							setWithLastConsumed(current, "filter", lv_filter_13_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMelangeurmodel.g:358:3: (otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMelangeurmodel.g:359:4: otherlv_14= 'wait' otherlv_15= 'before' otherlv_16= 'clean' ( (lv_time_17_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getMoveAccess().getWaitKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getMoveAccess().getBeforeKeyword_8_1());
                    			
                    otherlv_16=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_16, grammarAccess.getMoveAccess().getCleanKeyword_8_2());
                    			
                    // InternalMelangeurmodel.g:371:4: ( (lv_time_17_0= RULE_INT ) )
                    // InternalMelangeurmodel.g:372:5: (lv_time_17_0= RULE_INT )
                    {
                    // InternalMelangeurmodel.g:372:5: (lv_time_17_0= RULE_INT )
                    // InternalMelangeurmodel.g:373:6: lv_time_17_0= RULE_INT
                    {
                    lv_time_17_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_time_17_0, grammarAccess.getMoveAccess().getTimeINTTerminalRuleCall_8_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time",
                    							lv_time_17_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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


    // $ANTLR start "entryRuleDatatype"
    // InternalMelangeurmodel.g:394:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // InternalMelangeurmodel.g:394:49: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalMelangeurmodel.g:395:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype; 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalMelangeurmodel.g:401:1: ruleDatatype returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_varname_2_0= ruleVariable ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_varname_2_0 = null;



        	enterRule();

        try {
            // InternalMelangeurmodel.g:407:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_varname_2_0= ruleVariable ) ) ) )
            // InternalMelangeurmodel.g:408:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_varname_2_0= ruleVariable ) ) )
            {
            // InternalMelangeurmodel.g:408:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_varname_2_0= ruleVariable ) ) )
            // InternalMelangeurmodel.g:409:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ( (lv_varname_2_0= ruleVariable ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getDatatypeAccess().getDatatypeKeyword_0());
            		
            // InternalMelangeurmodel.g:413:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMelangeurmodel.g:414:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMelangeurmodel.g:414:4: (lv_name_1_0= RULE_ID )
            // InternalMelangeurmodel.g:415:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDatatypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMelangeurmodel.g:431:3: ( (lv_varname_2_0= ruleVariable ) )
            // InternalMelangeurmodel.g:432:4: (lv_varname_2_0= ruleVariable )
            {
            // InternalMelangeurmodel.g:432:4: (lv_varname_2_0= ruleVariable )
            // InternalMelangeurmodel.g:433:5: lv_varname_2_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getDatatypeAccess().getVarnameVariableParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_varname_2_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDatatypeRule());
            					}
            					set(
            						current,
            						"varname",
            						lv_varname_2_0,
            						"org.example.melangeurmodel.Melangeurmodel.Variable");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleVariable"
    // InternalMelangeurmodel.g:454:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMelangeurmodel.g:454:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMelangeurmodel.g:455:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMelangeurmodel.g:461:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMelangeurmodel.g:467:2: ( (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMelangeurmodel.g:468:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMelangeurmodel.g:468:2: (otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMelangeurmodel.g:469:3: otherlv_0= 'variable' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariableKeyword_0());
            		
            // InternalMelangeurmodel.g:473:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMelangeurmodel.g:474:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMelangeurmodel.g:474:4: (lv_name_1_0= RULE_ID )
            // InternalMelangeurmodel.g:475:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleCup"
    // InternalMelangeurmodel.g:495:1: entryRuleCup returns [EObject current=null] : iv_ruleCup= ruleCup EOF ;
    public final EObject entryRuleCup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCup = null;


        try {
            // InternalMelangeurmodel.g:495:44: (iv_ruleCup= ruleCup EOF )
            // InternalMelangeurmodel.g:496:2: iv_ruleCup= ruleCup EOF
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
    // InternalMelangeurmodel.g:502:1: ruleCup returns [EObject current=null] : (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nr_1_0=null;


        	enterRule();

        try {
            // InternalMelangeurmodel.g:508:2: ( (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) ) )
            // InternalMelangeurmodel.g:509:2: (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) )
            {
            // InternalMelangeurmodel.g:509:2: (otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) ) )
            // InternalMelangeurmodel.g:510:3: otherlv_0= 'cup' ( (lv_nr_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getCupAccess().getCupKeyword_0());
            		
            // InternalMelangeurmodel.g:514:3: ( (lv_nr_1_0= RULE_INT ) )
            // InternalMelangeurmodel.g:515:4: (lv_nr_1_0= RULE_INT )
            {
            // InternalMelangeurmodel.g:515:4: (lv_nr_1_0= RULE_INT )
            // InternalMelangeurmodel.g:516:5: lv_nr_1_0= RULE_INT
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
    // InternalMelangeurmodel.g:536:1: entryRuleClean returns [EObject current=null] : iv_ruleClean= ruleClean EOF ;
    public final EObject entryRuleClean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClean = null;


        try {
            // InternalMelangeurmodel.g:536:46: (iv_ruleClean= ruleClean EOF )
            // InternalMelangeurmodel.g:537:2: iv_ruleClean= ruleClean EOF
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
    // InternalMelangeurmodel.g:543:1: ruleClean returns [EObject current=null] : ( () otherlv_1= 'cleanup' ) ;
    public final EObject ruleClean() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMelangeurmodel.g:549:2: ( ( () otherlv_1= 'cleanup' ) )
            // InternalMelangeurmodel.g:550:2: ( () otherlv_1= 'cleanup' )
            {
            // InternalMelangeurmodel.g:550:2: ( () otherlv_1= 'cleanup' )
            // InternalMelangeurmodel.g:551:3: () otherlv_1= 'cleanup'
            {
            // InternalMelangeurmodel.g:551:3: ()
            // InternalMelangeurmodel.g:552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCleanAccess().getCleanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000090000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000081010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});

}