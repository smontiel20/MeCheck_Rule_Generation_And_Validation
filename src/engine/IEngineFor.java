package engine;

import parser.ASTForStmnt;

public interface IEngineFor {
    /**
     * Process the for statement node
     * @param forStmnt
     */
    void process(ASTForStmnt forStmnt);
}
