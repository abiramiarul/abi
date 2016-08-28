void reversing(struct node* head)
{
    if (head == NULL)
       return;

    reversing(head->next);

    printf("%d  ", head->data);
}
