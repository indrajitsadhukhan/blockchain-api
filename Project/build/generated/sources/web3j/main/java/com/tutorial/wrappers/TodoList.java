package com.tutorial.wrappers;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple3;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.1.
 */
@SuppressWarnings("rawtypes")
public class TodoList extends Contract {
    public static final String BINARY = "60806040526000805534801561001457600080fd5b506100626040518060400160405280601c81526020017f436865636b206f75742064617070756e69766572736974792e636f6d00000000815250610067640100000000026401000000009004565b610207565b60008054600190810180835560408051606081018252828152602080820187815282840187905293865284815291909420845181559151805192936100b493908501929190910190610111565b50604091820151600291909101805460ff19169115159190911790556000805491517f05d0fb833127fc08168556d0e7ca9554fc3f6bc843b3b7d2bf1c35aea6bab660926101069290918591906101a4565b60405180910390a150565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061015257805160ff191683800117855561017f565b8280016001018555821561017f579182015b8281111561017f578251825591602001919060010190610164565b5061018b92915061018f565b5090565b5b8082111561018b5760008155600101610190565b600084825260206060818401528451806060850152825b818110156101d7578681018301518582016080015282016101bb565b818111156101e85783608083870101525b5093151560408401525050601f91909101601f19160160800192915050565b6106dc806102166000396000f3fe608060405234801561001057600080fd5b5060043610610073577c01000000000000000000000000000000000000000000000000000000006000350463111002aa8114610078578063455f50241461008d578063779900b4146100a05780638d977672146100a8578063b6cb58a5146100d3575b600080fd5b61008b610086366004610579565b6100e8565b005b61008b61009b366004610612565b610192565b61008b6102f0565b6100bb6100b6366004610612565b610399565b6040516100ca93929190610643565b60405180910390f35b6100db610448565b6040516100ca919061062a565b60008054600190810180835560408051606081018252828152602080820187815282840187905293865284815291909420845181559151805192936101359390850192919091019061044e565b50604091820151600291909101805460ff19169115159190911790556000805491517f05d0fb833127fc08168556d0e7ca9554fc3f6bc843b3b7d2bf1c35aea6bab66092610187929091859190610643565b60405180910390a150565b61019a6104cc565b60008281526001602081815260409283902083516060810185528154815281840180548651600296821615610100026000190190911695909504601f810185900485028601850190965285855290949193858401939092908301828280156102435780601f1061021857610100808354040283529160200191610243565b820191906000526020600020905b81548152906001019060200180831161022657829003601f168201915b50505091835250506002919091015460ff161515602091820152604080830180511590526000858152600180845291902083518155838301518051949550859491936102949385019291019061044e565b50604091820151600291909101805460ff19169115159190911790558181015190517fe21fa966ca5cd02748c0752352d18c48165e61cb55b4c29cccf924b5a95fcff1916102e491859190610633565b60405180910390a15050565b60005b600054811015610396576000818152600160208190526040822080546002805480850182557f405787fa12a823e0f2b7631cc41b3ba8828b3321ca811111fa75cd3aa3bb5ace01919091556003805480850182559452908201805461038d947fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b0193919261010092821615929092026000190116046104ef565b506001016102f3565b50565b600160208181526000928352604092839020805481840180548651600296821615610100026000190190911695909504601f810185900485028601850190965285855290949193929091908301828280156104355780601f1061040a57610100808354040283529160200191610435565b820191906000526020600020905b81548152906001019060200180831161041857829003601f168201915b5050506002909301549192505060ff1683565b60005481565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061048f57805160ff19168380011785556104bc565b828001600101855582156104bc579182015b828111156104bc5782518255916020019190600101906104a1565b506104c8929150610564565b5090565b604051806060016040528060008152602001606081526020016000151581525090565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061052857805485556104bc565b828001600101855582156104bc57600052602060002091601f016020900482015b828111156104bc578254825591600101919060010190610549565b5b808211156104c85760008155600101610565565b6000602080838503121561058b578182fd5b823567ffffffffffffffff808211156105a2578384fd5b818501915085601f8301126105b5578384fd5b8135818111156105c3578485fd5b604051601f8201601f19168101850183811182821017156105e2578687fd5b60405281815283820185018810156105f8578586fd5b818585018683013790810190930193909352509392505050565b600060208284031215610623578081fd5b5035919050565b90815260200190565b9182521515602082015260400190565b600084825260206060818401528451806060850152825b818110156106765786810183015185820160800152820161065a565b818111156106875783608083870101525b5093151560408401525050601f91909101601f1916016080019291505056fea264697066735822122002e412cee44826be3c7f9145fca57d2c8d24983be635d1367573d28dc4ce9b4564736f6c63430007010033";

    public static final String FUNC_CREATETASK = "createTask";

    public static final String FUNC_GETALLTASKS = "getAllTasks";

    public static final String FUNC_TASKCOUNT = "taskCount";

    public static final String FUNC_TASKS = "tasks";

    public static final String FUNC_TOGGLECOMPLETED = "toggleCompleted";

    public static final Event TASKCOMPLETED_EVENT = new Event("TaskCompleted", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Bool>() {}));
    ;

    public static final Event TASKCREATED_EVENT = new Event("TaskCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Bool>() {}));
    ;

    @Deprecated
    protected TodoList(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TodoList(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TodoList(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TodoList(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<TaskCompletedEventResponse> getTaskCompletedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TASKCOMPLETED_EVENT, transactionReceipt);
        ArrayList<TaskCompletedEventResponse> responses = new ArrayList<TaskCompletedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TaskCompletedEventResponse typedResponse = new TaskCompletedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.completed = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<TaskCompletedEventResponse> taskCompletedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, TaskCompletedEventResponse>() {
            @Override
            public TaskCompletedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TASKCOMPLETED_EVENT, log);
                TaskCompletedEventResponse typedResponse = new TaskCompletedEventResponse();
                typedResponse.log = log;
                typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.completed = (Boolean) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<TaskCompletedEventResponse> taskCompletedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TASKCOMPLETED_EVENT));
        return taskCompletedEventFlowable(filter);
    }

    public List<TaskCreatedEventResponse> getTaskCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(TASKCREATED_EVENT, transactionReceipt);
        ArrayList<TaskCreatedEventResponse> responses = new ArrayList<TaskCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            TaskCreatedEventResponse typedResponse = new TaskCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.content = (String) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.completed = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<TaskCreatedEventResponse> taskCreatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, TaskCreatedEventResponse>() {
            @Override
            public TaskCreatedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(TASKCREATED_EVENT, log);
                TaskCreatedEventResponse typedResponse = new TaskCreatedEventResponse();
                typedResponse.log = log;
                typedResponse.id = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.content = (String) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.completed = (Boolean) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<TaskCreatedEventResponse> taskCreatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(TASKCREATED_EVENT));
        return taskCreatedEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> createTask(String _content) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_CREATETASK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_content)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> getAllTasks() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_GETALLTASKS, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<BigInteger> taskCount() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKCOUNT, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple3<BigInteger, String, Boolean>> tasks(BigInteger param0) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_TASKS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}, new TypeReference<Bool>() {}));
        return new RemoteFunctionCall<Tuple3<BigInteger, String, Boolean>>(function,
                new Callable<Tuple3<BigInteger, String, Boolean>>() {
                    @Override
                    public Tuple3<BigInteger, String, Boolean> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple3<BigInteger, String, Boolean>(
                                (BigInteger) results.get(0).getValue(), 
                                (String) results.get(1).getValue(), 
                                (Boolean) results.get(2).getValue());
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> toggleCompleted(BigInteger _id) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_TOGGLECOMPLETED, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_id)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static TodoList load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TodoList(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TodoList load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TodoList(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TodoList load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TodoList(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TodoList load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TodoList(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TodoList> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TodoList.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<TodoList> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TodoList.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TodoList> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TodoList.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TodoList> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TodoList.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class TaskCompletedEventResponse extends BaseEventResponse {
        public BigInteger id;

        public Boolean completed;
    }

    public static class TaskCreatedEventResponse extends BaseEventResponse {
        public BigInteger id;

        public String content;

        public Boolean completed;
    }
}
